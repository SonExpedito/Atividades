--Criação de Database
create database ExercBD01
--Utilizando o Banco de Dados
use ExercBD01

create Table pet
(
  Numregistro int, --Campo de Registro
  Nome Varchar (80), --Campo Varchar para o Nome
  Especie varchar (25), --Campo Varchar para a Especie
  Raca Varchar (30), -- Campo Varchar para a Raça
  Cor Varchar (40), --Campo Varchar para a Cor
  Nascimento datetime, --Campo Datetime para a Data de Nascimento
  Sexo Varchar(9), --Campo Varchar para o Sexo

)

use master
drop database ExercBD01
