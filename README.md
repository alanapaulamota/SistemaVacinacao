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
1 - eclipse (https://spring.io/tools)
2 - lombok (https://projectlombok.org/download)
3 - docker (https://www.docker.com/get-started)
3 - node js (https://nodejs.org/en/)
...

### Startar a aplicação no repositório local do projeto
- ./run-sistemavacinacao.sh

### Startar o mysql (docker) no repositório local do projeto
- ./run-mysql.sh
