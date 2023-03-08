create database Escola
use Escola

create Table Funcionario(
  Nome varchar (50) Not Null, --Nome Do Funcion�rio
  Rg Varchar (20) Not Null Unique, --Registro Geral
  CPF Varchar (30) Not Null Unique, --CPf do funcion�rio
  Rm Int Primary Key, --Matr�cula do Funcion�rio
  Data_Nascim Date Not Null, --Data de Nascimento do Funcion�rio
  Funcao Varchar (20) Not Null, -- �rea de Trabalho
  Formacao Varchar (20) Not Null Unique, --Certificado do Funcion�rio
  Telefone Varchar (18) Not Null, --Telefone
  Endereco Varchar(55) Not Null Unique, --Endere�o do Funcion�rio

)
