FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/TimeSheet_DevOps-1.0.jar TimeSheet_DevOps-1.0.jar
ENTRYPOINT ["java","-jar","/TimeSheet_DevOps-1.0.jar"]