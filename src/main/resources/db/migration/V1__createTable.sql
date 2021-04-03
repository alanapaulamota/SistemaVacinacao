#mysql -u root -p snv
#senha: P@ssW0rd

CREATE TABLE usuario (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL,
  NomeCompleto varchar(150) NOT NULL,
  endereco varchar(200) DEFAULT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (id),
  telefone VARCHAR(15),
  senha VARCHAR (10) NOT NULL,
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
