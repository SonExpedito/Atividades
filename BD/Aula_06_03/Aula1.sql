--Criação de Banco de Dados
create database teste 

--Abrindo o  Banco de Dados
use teste

--Criando uma Tabela

CREATE TABLE CLIENTE (
COD_CLI INT PRIMARY KEY NOT NULL,
NOME VARCHAR (50),
SOBRENOME VARCHAR (50)
)

alter table CLIENTE add Telefone Varchar (18); --Adiciona um novo campo
alter table Cliente drop Telefone; --Remover o Campo existente