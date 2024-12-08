FROM maven:3-jdk-17-alpine as build

WORKDIR /opt/app
COPY ./ /opt/app
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-alpine
COPY --from=build /opt/app/target/*.jar app.jar

ENV PORT 8081
EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "-Dserver.port=${PORT}", "app.jar"]