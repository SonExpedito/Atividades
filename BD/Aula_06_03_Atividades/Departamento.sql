create database Empresa
use Empresa

create Table Departamento(
 Nome Varchar (50) Not null Unique,
 Funcao Varchar (25) Not Null,
 ID Int Primary Key Identity, --Identifica��o do Setor
 Setores Varchar (55) Not Null, --Quantidade de Setor
 Funcionarios int Not Null, --Quantidade de Funcionario
 Localizacao Varchar (50) Not NUll, --Localiza��o do  Departamento
 Contato Varchar (15) Not Null Unique, --Email ou Telefone

)