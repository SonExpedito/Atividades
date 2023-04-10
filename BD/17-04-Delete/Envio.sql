-- criar bd Exemplo_Select
CREATE DATABASE Exemplo_Select;

-- abrir bd Exemplo_Select
use Exemplo_Select;

CREATE TABLE Envio
 (
	Cod_Envio int,
 	DataEnvio datetime,
  	Frete int,
	NomeNavio varchar(40),
 	Cidade varchar(15),
	Regiao varchar(15),
 	Pais varchar(15)
 );


INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10248,'7/4/1996',32.38,'Vins et alcools Chevalier','Abbaye','Reims','France');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10249,'7/5/1996',11.61,'Toms Spezialitaten','Luisenstr',nULL,'Germany');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10250,'7/8/1996',65.83,'Hanari Carnes','Rio de Janeiro','Sudeste','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10251,'7/8/1996',41.34,'Victuailles en stock','Lyon',NULL,'France');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10252,'7/9/1996',51.30,'Supremes delices','Boulevard Tirou', 'Charleroi','Belgium');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10253,'7/10/1996',58.17,'Hanari Carnes','Rio de Janeiro','Sudeste','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
vALUES (10254,'7/11/1996',22.98,'Chop-suey Chinese','Bern',NULL,'Switzerland');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10255,'7/12/1996',148.33,'Richter Supermarkt','Geneve',	NULL,'Switzerland');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10256,'15/7/1996',13.97,'Wellington Importadora','Resende','Sul','Brazil');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10257,'8/8/1996',81.91,'HILARION-Abastos','San Cristobal','Tachira','Venezuela');

INSERT INTO Envio (Cod_Envio,DataEnvio,Frete,NomeNavio,Cidade,Regiao,Pais)
VALUES (10258,'17/7/1996',140.51,'Ernst Handel','Kirchgasse','Graz','Austria');


delete from Envio where Regiao is Null;
delete from Envio where NomeNavio like 'Chop-suey Chinese';
delete from Envio where Frete > 100;
delete from Envio;

select * from Envio;

