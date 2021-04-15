#mysql u root p snv #senha: P@ssW0rd CREATE TABLE usuario
(
   id bigint (20) NOT NULL AUTO_INCREMENT,
   NomeCompleto varchar (150) NOT NULL,
   username varchar (100) NOT NULL,
   email varchar (50) NOT NULL,
   cpf varchar (50) NOT NULL,
   rg varchar (50) NOT NULL,
   endereco varchar (200) DEFAULT NULL,
   complemento varchar (200) DEFAULT NULL,
   cep varchar (200) DEFAULT NULL,
   sexo varchar (20) DEFAULT NULL,
   nomeMae varchar (200) DEFAULT NULL,
   nomePai varchar (200) DEFAULT NULL,
   PRIMARY KEY (id),
   telefone VARCHAR (15),
   senha VARCHAR (10) NOT NULL,
   confirmaSenha VARCHAR (10) NOT NULL,
   UNIQUE KEY UK_username (username)
);
CREATE TABLE vacina
(
   id bigint (20) NOT NULL AUTO_INCREMENT,
   nome VARCHAR (50) NOT NULL,
   tipo VARCHAR (100) NOT NULL,
   descricao VARCHAR (100) NOT NULL,
   fabricante VARCHAR (100) NOT NULL,
);
CREATE TABLE localVacinacao
(
   id bigint (20) NOT NULL AUTO_INCREMENT,
   nome VARCHAR (100) NOT NULL,
   endereco VARCHAR (100) NOT NULL,
   complemento VARCHAR (100) NOT NULL,
   cep VARCHAR (100) NOT NULL,
   telefone VARCHAR (100) NOT NULL,
);