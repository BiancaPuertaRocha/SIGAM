drop database banco;
create database banco;
use banco;
create table Pessoa(
    codigo      int primary key auto_increment,
    nome        varchar(50) not null,
    telefone    varchar(14) not null,
    dataNasc    Date not null,
    cidade      varchar(50) not null,
    bairro      varchar(50) not null,
    rua         varchar(50) not null,
    numero      int not null,
    login       varchar(10) not null,
    senha       varchar(10) not null,
    cpf         varchar(14) not null,
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
    TYPE        varchar(20) not null,
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
    especialidade   varchar(50) not null,
    CREF            varchar(20) not null,
    foreign key (codigo)    references Funcionario (codigo)

);
create table Matricula(
    codigoPessoa    int primary key,
    dataUltima      date not null,
    freqAtFisica    varchar(20),
    probOrtop       varchar(50),
    fumante         boolean default false,
    infSobrepeso    varchar(50),
    colesterol      varchar(20),
    medicamentos    varchar(100),
    foreign key(codigoPessoa) references Pessoa(codigo)
);
create table Despesa (
    codigo          int primary key,
    descricao       varchar(50) not null,
    vencimento      date not null,
    pagamento       date not null,
    valor           double not null,
    secretario      int,
    foreign key (secretario) references Secretario (codigo)
);
create table Pagamento(
    codigo          int primary key,
    codigoMatricula int not null,
    dias            int not null,
    valor           double not null,
    dataPag         date not null,
   foreign key(codigoMatricula) references Matricula(codigoPessoa)
);
create table Atividade(
    codigo          int primary key,
    equipamentos    varchar(100),
    musculo         varchar(50),
    descricao       varchar(50) not null
);
create table Ficha(
    codigo          int primary key,
    codigoMatricula int not null,
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
    foreign key(codigoMatricula) references Matricula(codigoPessoa)
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
