# UrnaEletronicaJavaSwing
App Java Swing Urna eletrônica com BD


Telas:


Tela inicial:

![image](https://user-images.githubusercontent.com/85845319/137444492-7a4177d2-ce84-4e71-827b-767de52f6e50.png)

A senha e usuaário do presidente da mesa para iniciar a eleição é "admin"


Tela de identificação do eleitor:

![image](https://user-images.githubusercontent.com/85845319/137444729-dedcf921-f24f-4237-90e3-2607e6c319f7.png)


Tela de identificação do eleitor com a busca por titulo ou rg já feita:

![image](https://user-images.githubusercontent.com/85845319/137446822-55b4cfa5-96d4-4969-b228-dad2c1d3b0cb.png)


Tela votação (urna):

![image](https://user-images.githubusercontent.com/85845319/137446895-744c975a-cacc-4c7d-acdd-db6076614644.png)



Se o eleitor já votou opção de votar fica desabilitada:


![image](https://user-images.githubusercontent.com/85845319/137446672-b7b61cac-d076-4313-8d29-78b4971241fc.png)




Tela Encerrar votação:

![image](https://user-images.githubusercontent.com/85845319/137445504-bc8137e3-d785-4ac0-bc03-e84c0aa83f29.png)

A senha do presidente da mesa para finalizar a eleição é "nimda".


Tela de apuração:

![image](https://user-images.githubusercontent.com/85845319/137445669-7168fda7-bf5c-41bc-8bfd-f3e2204b5bd2.png)


O botão encerrar seção zera todos os votos.








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






