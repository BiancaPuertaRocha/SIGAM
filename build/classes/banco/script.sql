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
SELECT * FROM SECRETARIO