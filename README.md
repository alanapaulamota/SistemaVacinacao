### maven

1. mvn clean install
2. java -jar target/login-tutorial.jar

- http://localhost:8080/registration
- http://localhost:8080/login

### Docker
- mvn clean install
- docker build --tag login-tutorial .
- docker run --net=host login-tutorial 

### Possíveis instalações
- eclipse (https://spring.io/tools)
- lombok (https://projectlombok.org/download)
- docker (https://www.docker.com/get-started) 
- node js (https://nodejs.org/en/)
- ...

### Baixar a imagem docker do mysql
- https://hub.docker.com/_/mysql ($ docker pull mysql)

[¹] Para iniciar uma instância do servidor mysql
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:tag


onde:


**some-mysql** = nome do container

**my-secret-pw** = senha do usuario do mysql;

**tag** = versao do mysql.

https://phoenixnap.com/kb/mysql-docker-container


### Startar a aplicação no repositório local do projeto
- ./run-sistemavacinacao.sh

### Startar o mysql (docker) no repositório local do projeto
- ./run-mysql.sh
