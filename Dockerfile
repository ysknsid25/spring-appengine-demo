FROM openjdk:8-jdk-alpine

COPY ./demo-0.0.1-SNAPSHOT.jar api.jar

RUN chmod 755 api.jar
RUN mkdir logs

ENTRYPOINT ["java","-jar","api.jar"]