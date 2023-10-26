create database Cinema;
use Cinema;

create table Sala(
	Cod_Sala int identity,
	Quanti_Cadei int Not Null,
	Tipo_Sala varchar (10) Not Null,
	Num_Sala varchar(2) Not Null,

	primary key (Cod_Sala)

);

create table Filme(
	Nome_Filme varchar (50) Unique Not Null,
	Cod_Filme int identity,
	Duracao time Not Null,
	Genero varchar (30) Not Null,
	Faixa_Etaria int Not Null,
	Produtora varchar (50) Not Null,

	primary key (Cod_Filme)
);

create table Sessao(
	Cod_Sala int,
	Cod_Filme int,
	Data_Hora datetime Not Null,
	Tipo_Sessao varchar (10) Not Null,
	Preco_Ingresso float Not Null,

	foreign key (Cod_Sala) references Sala,
	foreign key (Cod_Filme) references Filme,
);