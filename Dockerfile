FROM maven:3.9.6-eclipse-temurin-22-jammy AS build
COPY . .
FROM openjdk:17 AS builder
COPY --from=build /target/spring-application-github-actions.jar spring-application-github-actions.jar
EXPOSE 2346
ENTRYPOINT ["java", "-jar", "spring-application-github-actions.jar"]

USER nobody
