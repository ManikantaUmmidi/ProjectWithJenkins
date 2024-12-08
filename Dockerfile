FROM openjdk:17-jdk-alpine
EXPOSE 8082
ADD target/*.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-jenkins.jar"]