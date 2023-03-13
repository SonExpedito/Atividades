create database Papelaria

use Papelaria

create Table Produtos(
    Nome Varchar (30) Not Null, --Nome do Produto
	Preco float Not Null, --Pre�o do Produto
	Lote Int Not Null, --Lote do Produto
	Estoque Int Not Null, --Estoque do Produto
	ID Int Primary  Key Identity, --identifica��o do Produto
	Locau Varchar (3) Not Null, --Localiza��o do Produto, dada pelo Setor e 
	--Prateleira no esquema "1A" em que 1 � o Setor e A prateleira.
	Fabricante Varchar (25), --Fabricante do Produto
	Ean int Not Null Unique, --C�digo de barras

)

use Master
drop database Papelaria