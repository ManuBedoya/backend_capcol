#!bin/bash

mvn package -Pnative -Dquarkus.native.container-build=true
./target/hello-quarkus-1.0-SNAPSHOT-runner
docker build -f src/main/docker/Dockerfile.native -t quarkus/backend_capcol .
docker run -i --rm --name backend_capcol --env PORT=8081 -p 8081:8081 quarkus/backend_capcol