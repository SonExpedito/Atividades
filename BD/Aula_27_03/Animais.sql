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

--Registros
--1
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (1 , 'Kaizer', 'Gato' , 'Vira-Lata', 'Preto', '30/05/2005', 'Masculino');

--2
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (2 , 'Bela', 'Cachorra' , 'Vira-Lata', 'Marrom', '10/05/2020', 'Feminino');

--3
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (3 , 'Lala', 'Cachorra' , 'Vir-lata', 'Branca', '02/02/2008', 'Feminino');

--4
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (4 , 'Blu', 'Arara ' , 'Arara-Azul', 'Azul', '08/04/2011', 'Masculino');

--5
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (5 , 'Rafael', 'Tucano' , 'Tucano-de-peito-amarelo', 'Preto', '06/07/2012', 'Masculino');

--6
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (6 , 'Lobo-Mau', 'Lobo' , 'Lobo-Guará', 'Laranja-Avermelhado', '02/09/2020', 'Masculino');

--7
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (7 , 'Nick', 'Raposa' , 'Raposa-Vermelha', 'Vermelha', '17/03/2016', 'Masculino');

--8
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (8 , 'Alex', 'Leão' , 'Leão', 'Amarelo-e-Marron', '20/09/2006', 'Masculino');

--9
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (9 , 'Gloria', 'Hipopotamo' , 'Hipopótamo-do-Nilo', 'Preto', '12/08/2003', 'Feminino');

--10
Insert Into pet (Numregistro, Nome, Especie, Raca, Cor, Nascimento, Sexo)
Values (10 , 'Marty', 'Zebra' , 'Zebra-das-planícies', 'Preto-Branco', '18/10/2004', 'Masculino');




Select * from pet;