# Projeto JDBC #
Comandos de criação de imagens
docker build -t mysql-image -f dbDocker/Dockerfile .

docker run --rm --name mysql-container mysql-image

docker run -v $(pwd) --rm --name mysql-container mysql-image

docker exec -i mysql-container mysql uroot -pjdbc < dbDocker/script.sql

docker exec -it mysql-container /bin/bash



