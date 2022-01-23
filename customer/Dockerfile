FROM openjdk:8-jdk-alpine
MAINTAINER thouradev.com

WORKDIR /customer

COPY target/customer-1.0.0.jar customer-1.0.0.jar

RUN chmod +x customer-1.0.0.jar

ENTRYPOINT ["java","-jar","customer-1.0.0.jar"]