# Usar una imagen base con JDK 11 y Maven
#FROM maven:3.8.4-openjdk-17 AS build
FROM maven:3.9.9-amazoncorretto-21-debian-bookworm AS build

# Establecer un directorio de trabajo
WORKDIR /app

# Copiar archivos de tu proyecto al directorio de trabajo
COPY . /app

# Ejecutar Maven para construir el proyecto
RUN mvn clean package

# Crear una nueva imagen basada en OpenJDK 11
FROM eclipse-temurin:21-jdk-alpine

# Exponer el puerto que utilizará la aplicación
EXPOSE 8080

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /app/target/quarkus-app/ /app/

# Establecer el punto de entrada para ejecutar la aplicación
CMD ["java", "-jar", "/app/quarkus-run.jar"]