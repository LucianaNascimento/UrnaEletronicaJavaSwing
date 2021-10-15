# UrnaEletronicaJavaSwing
App Java Swing Urna eletrônica com BD


Telas:



A senha e usuaário do presidente da mesa para iniciar a eleição é "admin"

A senha e usuaário do presidente da mesa para finalizar a eleição será "nimda".



Banco de dados

Nome: bdeleicoes

Estrutura das tabelas:

eleitor:

CREATE TABLE eleitor(
ele_titulo        VARCHAR(20),
ele_rg             VARCHAR(20),
ele_nome        VARCHAR(60),
ele_dataNasc   VARCHAR(10),
ele_zona          VARCHAR(04),
ele_secao         VARCHAR(04),
ele_votou         VARCHAR(01),
ele_foto           VARCHAR(20),
ele_cidade       VARCHAR(40),
ele_estado       VARCHAR(02),
PRIMARY KEY(ele_titulo));


candidato:

CREATE TABLE candidato(
can_numero   INT,
can_nome     VARCHAR(60),
can_vice     VARCHAR(60),
can_partido  VARCHAR(10),
can_foto     VARCHAR(20),
can_fotovice VARCHAR(20),
can_votos    INT,
PRIMARY KEY(can_numero));


INSERT INTO candidato(can_numero, can_nome, can_vice, can_partido, can_foto, can_fotovice, can_votos)
VALUES(10, 'Carlos Drummond Andrade', 'Monteiro Lobato', 'AA', 'carlosdrummond.png', 'monteirolobato.png', 0),
             (20, 'Machado de Assis', 'Guimarães Rosa', 'BB', 'machadoassis.png', 'guimaraesrosa.png', 0),
             (30, 'Graciliano Ramos', 'José de Alencar', 'CC', 'gracilianoramos.png', 'josealencar.png', 0),
             (40, 'Clarice Lispector', 'Cecília Meireles', 'DD', 'clarice.png', 'ceciliameireles.png', 0),
             (50, 'Jorge Amado', 'Mário de Andrade', 'EE', 'jorgeamado.png', 'marioandrade.png', 0),
             (0,  'Voto em branco', 'Voto em branco', '', '', '', 0),
             (99, 'Voto Nulo', 'Voto Nulo', '', '', '',  0) ;

Dados para teste:

INSERT INTO eleitor(ele_titulo, ele_rg, ele_nome, ele_dataNasc, ele_zona, ele_secao, ele_votou, ele_foto, ele_cidade, ele_estado)
VALUES('1', '21.711.866-5', 'Marcos Vinicius Elias Duarte', '24/01/1981', '298', '0083', 'N', 'f1.png','Bragança Paulista', 'SP'),
('2', '30.534.312-9', 'Augusto Lorenzo Murilo Santos', '17/01/1971', '298', '0083', 'N', 'f2.png','Bragança Paulista', 'SP'),
('3', '32.750.462-6', 'Anderson Otávio Galvão', '18/11/1999', '298', '0083', 'N', 'f3.png','Bragança Paulista', 'SP'),
('4', '48.377.932-5', 'Marcela Laura Daiane Peixoto', '14/10/1978', '298', '0083', 'N', 'f4.png','Bragança Paulista', 'SP'),
('5', '26.810.090-1', 'Emanuel Osvaldo Cauê Barbosa', '13/09/1966', '298', '0083', 'N', 'f5.png','Bragança Paulista', 'SP'),
('6', '18.688.153-8', 'Mário Breno Assis', '02/04/1975', '298', '0083', 'N', 'f6.png','Bragança Paulista', 'SP'),
('7', '31.564.921-5', 'Isabelle Antonella Raquel Pires', '18/11/1958', '298', '0083', 'N', 'f7.png','Bragança Paulista', 'SP'),
('8', '19.437.690-4', 'Sarah Débora Maitê Aragão', '23/05/1989', '298', '0083', 'N', 'f8.png','Bragança Paulista', 'SP'),
('9', '27.872.608-2', 'Milena Sara Bárbara Cardoso', '26/11/1986', '298', '0083', 'N', 'f9.png','Bragança Paulista', 'SP'),
('10', '18.222.685-2', 'Marcos Vinicius Victor Arthur da Rocha', '19/05/1946', '298', '0083', 'N', 'f10.png','Bragança Paulista', 'SP'),
('11', '25.875.324-9', 'Isabel Heloise das Neves', '24/12/1963', '298', '0083', 'N', 'f11.png','Bragança Paulista', 'SP'),
('12', '19.544.691-4', 'Fernanda Stefany Isabelle Corte Real', '19/05/1945', '298', '0083', 'N', 'f12.png','Bragança Paulista', 'SP'),
('13', '48.456.552-7', 'Lorenzo Erick Baptista', '25/10/1953', '298', '0083', 'N', 'f13.png','Bragança Paulista', 'SP'),
('14', '47.668.380-4', 'Clarice Olivia Tânia da Rosa', '22/08/1998', '298', '0083', 'N', 'f14.png','Bragança Paulista', 'SP'),
('15', '33.958.318-6', 'Emanuelly Maitê Silva', '10/07/1992', '298', '0083', 'N', 'f15.png','Bragança Paulista', 'SP');




