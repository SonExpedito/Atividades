create database ExercBD02 --Criando o Banco de Dados
use ExercBD02 --Utilizando o Banco de Dados

Create Table Departamento(
  CodFunc int, --Criando o Campo CodFunc
  NomeDepto Varchar (50) --Criando o campo NomeDepto
)

Create Table Funcionario ( --Criando tabela Funcionario
  CodFunc int , --Criando campo codfunc
  NomeFunc varchar (50), --Criando campo nomefunc
  CodDepto int, --Criando campo coddepto
  Ramal int Null, --Criando campo ramal
  Salario float,
  DataAdmissao datetime, --criando campo dataadmissao
  DataCadastro datetime, --Criando campo datacastro
  Sexo char(1)
)


--Criando os Registros
--Departamento
--1
Insert into Departamento (CodFunc, NomeDepto)
Values (1,'Contabilidade');
--2
Insert into Departamento (CodFunc, NomeDepto)
Values (2,'Administração');
--3
Insert into Departamento (CodFunc, NomeDepto)
Values (3,'Programação');
--4
Insert into Departamento (CodFunc, NomeDepto)
Values (4,'Comunicação');
--5
Insert into Departamento (CodFunc, NomeDepto)
Values (5,'Marketing');


--Funcionários

Insert into Funcionario (CodDepto, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values ();

