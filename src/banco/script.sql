drop database banco;
create database banco;
use banco;
create table Pessoa(
    codigo      int primary key auto_increment,
    nome        varchar(50) not null,
    telefone    varchar(11) not null,
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
    obsSaude    varchar(100) not null,
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
SELECT * FROM Pessoa;
