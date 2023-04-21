-- criar bd Exemplo_Select
CREATE DATABASE Exemplo_Select;

-- abrir bd Exemplo_Select
use Exemplo_Select;


CREATE TABLE Territorio
(
       Cod_Territorio varchar(20) NOT NULL,
       Territoriodescricao varchar(50) NOT NULL,
       Cod_Regiao int
);


Insert Into Territorio Values ('01581','Westboro',1);
Insert Into Territorio Values ('01730','Bedford',1);
Insert Into Territorio Values ('01833','Georgetow',1);
Insert Into Territorio Values ('02116','Boston',1);
Insert Into Territorio Values ('02139','Cambridge',1);
Insert Into Territorio Values ('02184','Braintree',1);
Insert Into Territorio Values ('02903','Providence',1);
Insert Into Territorio Values ('03049','Hollis',3);
Insert Into Territorio Values ('03801','Portsmouth',3);
Insert Into Territorio Values ('06897','Wilton',1);
Insert Into Territorio Values ('07960','Morristown',1);
Insert Into Territorio Values ('08837','Edison',1);
Insert Into Territorio Values ('10019','New York',1);
Insert Into Territorio Values ('10038','New York',1);
Insert Into Territorio Values ('11747','Mellvile',1);
Insert Into Territorio Values ('14450','Fairport',1);
Insert Into Territorio Values ('19428','Philadelphia',3);
Insert Into Territorio Values ('19713','Neward',1);
Insert Into Territorio Values ('20852','Rockville',1);
Insert Into Territorio Values ('27403','Greensboro',1);
Insert Into Territorio Values ('27511','Cary',1);
Insert Into Territorio Values ('29202','Columbia',4);
Insert Into Territorio Values ('30346','Atlanta',4);
Insert Into Territorio Values ('31406','Savannah',4);
Insert Into Territorio Values ('32859','Orlando',4);
Insert Into Territorio Values ('33607','Tampa',4);
Insert Into Territorio Values ('40222','Louisville',1);
Insert Into Territorio Values ('44122','Beachwood',3);
Insert Into Territorio Values ('45839','Findlay',3);
Insert Into Territorio Values ('48075','Southfield',3);
Insert Into Territorio Values ('48084','Troy',3);
Insert Into Territorio Values ('48304','Bloomfield Hills',3);
Insert Into Territorio Values ('53404','Racine',3);
Insert Into Territorio Values ('55113','Roseville',3);
Insert Into Territorio Values ('55439','Minneapolis',3);
Insert Into Territorio Values ('60179','Hoffman Estates',2);
Insert Into Territorio Values ('60601','Chicago',2);
Insert Into Territorio Values ('72716','Bentonville',4);
Insert Into Territorio Values ('75234','Dallas',4);
Insert Into Territorio Values ('78759','Austin',4);
Insert Into Territorio Values ('80202','Denver',2);
Insert Into Territorio Values ('80909','Colorado Springs',2);
Insert Into Territorio Values ('85014','Phoenix',2);
Insert Into Territorio Values ('85251','Scottsdale',2);
Insert Into Territorio Values ('90405','Santa Monica',2);
Insert Into Territorio Values ('94025','Menlo Park',2);
Insert Into Territorio Values ('94105','San Francisco',2);
Insert Into Territorio Values ('95008','Campbell',2);
Insert Into Territorio Values ('95054','Santa Clara',2);
Insert Into Territorio Values ('95060','Santa Cruz',2);
Insert Into Territorio Values ('98004','Bellevue',2);
Insert Into Territorio Values ('98052','Redmond',2);
Insert Into Territorio Values ('98104','Seattle',2);

Update Territorio set Territoriodescricao = 'Nova Iorque' where Territoriodescricao like 'New York'
Update Territorio set Cod_Regiao = 22 where Cod_Regiao = 2
Update Territorio set Cod_Regiao = 9 where Cod_Territorio <3000
Update Territorio set Territoriodescricao = 'São Francisco' where Territoriodescricao = 'San Francisco'


select * from Territorio;