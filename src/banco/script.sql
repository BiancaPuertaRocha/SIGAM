drop database if exists banco;
create database banco;
use banco;
create table Pessoa(
    codigo      int primary key auto_increment,
    nome        varchar(50) not null,
    telefone    varchar(15) not null,
    dataNasc    Date not null,
    cidade      varchar(50) not null,
    bairro      varchar(50) not null,
    rua         varchar(50) not null,
    numero      int not null,
    login       varchar(10) not null unique,
    senha       varchar(10) not null,
    cpf         varchar(14) not null unique,
    rg          varchar(12) not null,
    email       varchar(50) not null,
    imagem      longblob,
    TYPE        varchar(20) 

);
create table Funcionario(
    codigo      int primary key, 
    salario     float not null,
    hrEntrada   time not null,
    hrSaida     time not null,
    DTYPE        varchar(20),
    foreign key (codigo)    references Pessoa (codigo)
);

create table Secretario(
    codigo          int primary key, 
    departamento    varchar(50) not null,
    tipo            boolean not null,
    foreign key (codigo)    references Funcionario (codigo)

);

create table Treinador(
    codigo          int primary key, 
    especialidade   varchar(50) ,
    CREF            varchar(20) not null,
    foreign key (codigo)    references Funcionario (codigo)

);
create table Aluno(
    codigo          int   primary key,
    dataUltima      date,
    freqAtFisica    varchar(20),
    probOrtop       varchar(50),
    fumante         boolean default false,
    infSobrepeso    varchar(50),
    colesterol      varchar(20),
    medicamentos    varchar(100),
    status          boolean,
    foreign key(codigo) references Pessoa(codigo)
);
create table Caixa (
    codigo          int auto_increment primary key,
    secretario      int,
    hrAbertura      time not null,
    hrFechamento    time,
    data            date not null,
    saldoInicial    double not null,
    saldoFinal      double,
    entradas        double,
    saidas          double,
 foreign key (secretario) references Secretario (codigo)
);
create table Despesa (
    codigo          int auto_increment primary key,
    descricao       varchar(50) not null,
    vencimento      date not null,
    pagamento       date ,
    valor           double not null,
    tipo            varchar(20),
    caixa           int, 
    foreign key (caixa) references Caixa (codigo)
);

create table Pagamento(
    codigo          int auto_increment primary key,
    aluno           int not null,
    dias            int not null,
    valor           double not null,
    dataPag         date,
    caixa           int,
    validade        date,
    foreign key (caixa) references Caixa (codigo),
    foreign key(aluno) references Aluno(codigo)
);
create table Atividade(
    codigo          int auto_increment primary key ,
    equipamentos    varchar(100),
    musculo         varchar(50),
    descricao       varchar(50) not null
);
create table Ficha(
    codigo          int auto_increment primary key,
    matricula       int not null,
    peso            double not null,
    altura          double not null,
    dataAv          date not null,
    proxAv          date,
    quadril         double,
    abdomen         double,
    bicepsEsq       double,
    bicepsDir       double,
    antebracoEsq    double,
    antebracoDir    double,
    cintura         double,
    coxaEsq         double,
    coxaDir         double,
    panturrilhaEsq  double,
    panturrilhaDir  double,
    foreign key(matricula) references Aluno(codigo)
);
create table ItemDeAtividade(
    atividade       int not null,
    ficha           int not null,
    repeticoes      int,
    series          int,
    duracao         int,
    primary key(atividade, ficha),
    foreign key(atividade) references Atividade(codigo),
    foreign key(ficha) references Ficha(codigo)
);
DELIMITER $ 
CREATE TRIGGER addMensalidadeCaixa AFTER INSERT
ON Pagamento
FOR EACH ROW
BEGIN
    UPDATE Caixa SET entradas = entradas + NEW.valor
WHERE codigo = NEW.caixa;
END$
DELIMITER ;


DELIMITER $ 
CREATE TRIGGER updateMensalidadeCaixa AFTER UPDATE
ON Pagamento
FOR EACH ROW
BEGIN
    UPDATE Caixa SET entradas = entradas + NEW.valor
WHERE codigo = NEW.caixa;
END$
DELIMITER ;


DELIMITER $ 
CREATE TRIGGER deleteMensalidadeCaixa AFTER DELETE
ON Pagamento
FOR EACH ROW
BEGIN
    UPDATE Caixa SET entradas = entradas - OLD.valor
WHERE codigo = OLD.caixa;
END$
DELIMITER ;



DELIMITER $ 
CREATE TRIGGER addDespesasCaixa AFTER INSERT
ON Despesa
FOR EACH ROW
BEGIN
    IF NEW.pagamento is not NULL THEN
        UPDATE Caixa SET saidas = saidas + NEW.valor 
        WHERE codigo = NEW.caixa;
    END IF;
END$
DELIMITER ;


DELIMITER $ 
CREATE TRIGGER updateDespesasCaixa AFTER UPDATE
ON Despesa
FOR EACH ROW
BEGIN
    IF NEW.caixa is not NULL THEN
        UPDATE Caixa SET saidas = saidas + NEW.valor
        WHERE codigo = NEW.caixa;
    END IF;
END$
DELIMITER ;


DELIMITER $ 
CREATE TRIGGER deleteDespesasCaixa AFTER DELETE
ON Despesa
FOR EACH ROW
BEGIN
   IF OLD.pagamento is not NULL THEN
        UPDATE Caixa SET saidas = saidas - OLD.valor 
        WHERE codigo = OLD.caixa;
    END IF;
END$
DELIMITER ;


select * from Caixa;

select * from Pessoa;
