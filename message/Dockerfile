FROM openjdk:8-jdk-alpine
MAINTAINER thouradev.com

WORKDIR /message

COPY target/message-1.0.0.jar message-1.0.0.jar

RUN chmod +x message-1.0.0.jar

ENTRYPOINT ["java","-jar","message-1.0.0.jar"]