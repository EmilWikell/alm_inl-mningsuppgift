FROM openjdk:17.0.2-oraclelinux8 AS build-stage
WORKDIR /build
COPY ./mvnw .
COPY ./.mvn/ .mvn/
COPY ./pom.xml .
COPY ./src/ src/
RUN chmod +x mvnw
RUN sed -i 's/\r$//' mvnw
RUN ./mvnw package
FROM openjdk:17.0.2-oraclelinux8
WORKDIR /app
COPY --from=build-stage /build/target/api-*jar /app/api.jar
EXPOSE 8080
CMD ["java", "-jar", "api.jar"]
