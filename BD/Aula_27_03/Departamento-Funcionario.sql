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

Select * from  Departamento;


--Funcionários
--1
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (1, 'Alex', 2, 40028922, 5000, 24/12/2022, 10/12/2022, 'M' );
--2
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (2, 'Endrigo', 5 , 5461534, 1700, 25/06/2021, 15/06/2021, 'F' );
--3
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (3, 'Guilherme', 1, 037651, 3000, 15/02/2020, 08/02/2020, 'M');
--4
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (4, 'Danilão', 3, 516515, 2200, 15/03/2019, 08/03/2019, 'M');
--5
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (5, 'Bruno', 4, 561651, 200, 11/09/2003, 02/03/2011, 'M');
--6
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (6, 'Igor', 2, 1561651, 2, 15/08/2022, 07/08/2022, 'M');
--7
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (7, 'Giovanna', 3, 1561561, 800, 14/05/2018, 08/05/2018, 'F');
--8
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (8, 'Gabriel', 4, 15616, 5, 10/10/2022, 01/10/2022, 'M');
--9
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (9, 'Diogo', 5, 1651561, 1, 15/05/2017, 15/05/2017, 'M');
--10
Insert into Funcionario (CodFunc, NomeFunc, CodDepto, Ramal, Salario, DataAdmissao, DataCadastro, Sexo)
Values (10, 'Edna', 1, 156165165, 55000, 19/02/2016, 02/02/2016, 'F' );


Select * from  Funcionario;