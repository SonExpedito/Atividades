-- criar bd Exemplo_Select
CREATE DATABASE Exemplo_Select;

-- abrir bd Exemplo_Select
use Exemplo_Select;

-- criação tabela Categoria
CREATE TABLE Categoria
(
Cod_Categoria int,
Nome_Categoria varchar (15) NOT NULL,
Descricao varchar(25) NULL,
PRIMARY KEY (Cod_Categoria)
 );

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (1,'Beverages','Soft drinks');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (2,'Condiments','Sweet and savory sauces');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (3,'Confections','candies');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (4,'Dairy Products','Cheeses');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (5,'Grains/Cereals','cereal');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (6,'Meat/Poultry','Prepared meats');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (7,'Produce','Dried fruit and bean curd');

INSERT into categoria (Cod_categoria,Nome_categoria,descricao) 
VALUES (8,'Seafood','Seaweed and fish');

delete from Categoria where Descricao like 'Cheeses';
delete from Categoria where Descricao like 's%';
delete from Categoria where Nome_Categoria like '%a%';
delete from Categoria;

select * from Categoria;