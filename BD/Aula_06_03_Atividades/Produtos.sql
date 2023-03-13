create database Papelaria

use Papelaria

create Table Produtos(
    Nome Varchar (30) Not Null, --Nome do Produto
	Preco float Not Null, --Preço do Produto
	Lote Int Not Null, --Lote do Produto
	Estoque Int Not Null, --Estoque do Produto
	ID Int Primary  Key Identity, --identificação do Produto
	Locau Varchar (3) Not Null, --Localização do Produto, dada pelo Setor e 
	--Prateleira no esquema "1A" em que 1 é o Setor e A prateleira.
	Fabricante Varchar (25), --Fabricante do Produto
	Ean int Not Null Unique, --Código de barras

)

use Master
drop database Papelaria