--drop database banco;
--create database banco;
use banco;
create table Pessoa(
    codigo      int primary key auto_increment,
    nome        varchar(50),
    telefone    varchar(15),
    dataNasc    Date,
    cidade      varchar(50),
    bairro      varchar(50),
    numero      int,
    login       varchar(50),
    senha       varchar(10),
    cpf         varchar(14),
    rg          varchar(12),
    email       varchar(50),
    imagem      varchar(200),
    TYPE        varchar(20)

);
create table Funcionario(
    codigo      int primary key, 
    salario     float,
    obsSaude    varchar(100),
    hrEntrada   time,
    hrSaida     time,
    TYPE        varchar(20),
    foreign key (codigo)    references Pessoa (codigo)
);

create table Secretario(
    codigo          int primary key, 
    departamento    varchar(50),
    tipo            boolean,
    foreign key (codigo)    references Funcionario (codigo)

);

create table Treinador(
    codigo          int primary key, 
    especialidade   varchar(50),
    CREF            varchar(20),
    foreign key (codigo)    references Funcionario (codigo)


);
create table matricula (
    codigo          int primary key,
    aluno           int,
    atualidade      boolean,
    dataMatricula   date,
    freqAtFisica    varchar(100),
    probOrtop       varchar(200),
    lesoes          varchar (200),
    fumante         boolean,
    doencaCronica   varchar(200),
    infSobrepeso    varchar(200),
    colesterol      varchar(100),
    medicamentos    varchar(200),
    foreign key (aluno) references pessoa (codigo)
);
create table pagamento(
    codigo      int auto_increment primary key,
    dataPag     date,
    valor       double,
    dias        int,
    matricula   int,
    foreign key (matricula) references matricula (codigo)
);

create table fichaTreino (
    codigo int auto_increment primary key,
    peso double,
    altura double,
    dataAv date,
    proxAv date,
    quadril double,
    abdomen double,
    bicepsEsq double,
    bicepsDir double,
    cintura double,
    antebracoEsq double,
    antebracoDir double,
    coxaEsq double,
    coxaDir double,
    parturrilhaEsq double,
    parturrilhaDir double,matricula   int,
    foreign key (matricula) references matricula (codigo)
);

create table atividade (
    codigo int auto_increment primary key,
    descricao varchar(50),
    equipamentos varchar(60),
    musculo varchar(30)
);

create table itemAtividade (
    atividade int,
    ficha int,
    series int,
    repeticoes int,
    duracao int,
    foreign key (atividade) references atividade(codigo),
    foreign key (ficha) references fichaTreino(codigo),

    primary key (atividade, ficha)
);

SELECT * FROM secretario;
