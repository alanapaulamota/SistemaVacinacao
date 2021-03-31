#mysql -u root -p snv
#senha: P@ssW0rd

CREATE TABLE IF NOT EXISTS usuario (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  cardeneta_id INT UNSIGNED NOT NULL,
  nome VARCHAR(100) NOT NULL,
  username VARCHAR(100) NOT NULL,
  telefone NUMBER(15) NOT NULL,
  email VARCHAR(45) NOT NULL,
  dataNasc DATE NOT NULL,
  cpf DECIMAL(11) UNSIGNED ZEROFILL NOT NULL,
  rg DECIMAL(8) UNSIGNED ZEROFILL NOT NULL,
  endereco VARCHAR(100) NOT NULL,
  complemento VARCHAR(50) NOT NULL,
  cep DECIMAL(8) ZEROFILL NOT NULL,
  sexo ENUM('F', 'M', 'Não declarar') NOT NULL,
  nomeMae VARCHAR(100) NOT NULL,
  nomePai VARCHAR(100) NOT NULL,
  cartaoSus DECIMAL(15) ZEROFILL NULL,
  senha varchar(10) NOT NULL,
  confirmaSenha varchar(10) NOT NULL,
  PRIMARY KEY (id, cardeneta_id),
  UNIQUE INDEX UK_paciente_CPF (cartaoSus ASC) VISIBLE)
ENGINE = InnoDB;
