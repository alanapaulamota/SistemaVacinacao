#!/bin/bash

#docker run --name some-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=SistemaVacinacao -e MYSQL_USER=user -e MYSQL_PASSWORD=P@ssW0rd  -d mysql:tag

docker run --rm -it --name bd-svn -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=SistemaVacinacao -e MYSQL_USER=user -e MYSQL_PASSWORD=P@ssW0rd  mysql:latest
