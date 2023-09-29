# Usar una imagen base con JDK 11 y Maven
#FROM maven:3.8.4-openjdk-17 AS build
FROM maven:3.9.4-eclipse-temurin-17-alpine AS build

# Establecer un directorio de trabajo
WORKDIR /app

# Copiar archivos de tu proyecto al directorio de trabajo
COPY . /app

# Ejecutar Maven para construir el proyecto
RUN mvn clean package

# Crear una nueva imagen basada en OpenJDK 11
FROM openjdk:17.0.1-jdk-slim

# Exponer el puerto que utilizará la aplicación
EXPOSE 8080

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /app/target/quarkus-app/quarkus-run.jar /app/backend_capcol-1.0.0-SNAPSHOT.jar

# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/backend_capcol-1.0.0-SNAPSHOT.jar"]