create database LojaTecidos

use LojaTecidos

create Table Fornecedores (
 Nome Varchar (30) Not Null, --Nome da Empresa
 ID int Primary Key Identity, --Identificação da Empresa
 Pessoa_Contato Varchar (50) Not Null, --Representante para Contato
 Site Varchar (365) Not Null Unique, --Site
 Telefone Varchar (18) Not Null Unique,
 Email Varchar (64) Not Null Unique,
 CNPJ varchar (25) Not Null Unique,
 Endreco Varchar (55) Not Null,
)