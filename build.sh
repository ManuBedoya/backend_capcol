#!bin/bash

./mvnw clean package
docker build -f src/main/docker/Dockerfile.native -t quarkus/backend_capcol .
docker run -i --rm --name backend_capcol --env PORT=8081 -p 8081:8081 quarkus/backend_capcol