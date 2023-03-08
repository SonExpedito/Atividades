create database Escola
use Escola

create Table Funcionario(
  Nome varchar (50) Not Null, --Nome Do Funcionário
  Rg Varchar (20) Not Null Unique, --Registro Geral
  CPF Varchar (30) Not Null Unique, --CPf do funcionário
  Rm Int Primary Key, --Matrícula do Funcionário
  Data_Nascim Date Not Null, --Data de Nascimento do Funcionário
  Funcao Varchar (20) Not Null, -- Área de Trabalho
  Formacao Varchar (20) Not Null Unique, --Certificado do Funcionário
  Telefone Varchar (18) Not Null, --Telefone
  Endereco Varchar(55) Not Null Unique, --Endereço do Funcionário

)
