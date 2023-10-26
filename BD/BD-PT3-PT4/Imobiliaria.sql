create database imobiliaria;
use imobiliaria;

create table Condominio(
		Cod_cond int identity,
		Endereco varchar (50) Unique Not Null,
		Num_Cond int Unique,
		Data_fund date,

		primary key (Cod_cond)

);

create table Proprietario(
	Id_Dono int Identity,
	Nome varchar (50) Not Null,
	RG varchar (12) Unique Not Null,
	CPF varchar (16) Unique Not Null,
	Data_Nasc date Not Null,

	primary key (id_Dono)
);

create table Locatorios(
	Cod_Locatorio int Identity,
	Nome varchar (50) Not Null,
	RG varchar (12) Unique Not Null,
	CPF varchar (16) Unique Not Null,
	Data_Nasc date Not Null,

	primary key (Cod_Locatorio)
);

create table Propriedade(
	Id_Proprie int Identity,
	Cod_cond int,
	Cod_Locador int,
	Numero_Bloco varchar (3) Not Null,
	Andar int Not Null,

	primary key (Id_Proprie),

	foreign key (Cod_cond) references Condominio,
	foreign key (Cod_Locador) references Locatorios

);

create table Detem(
	Id_Propri int,
	Id_Dono int,

	foreign key (Id_Propri) references Propriedade,
	foreign key (Id_Dono) references Proprietario
);

