FROM openjdk:8-jdk-alpine
MAINTAINER thouradev.com

WORKDIR /customer

COPY customer/target/customer-1.0.0.jar customer-1.0.0.jar

ENTRYPOINT ["java","-jar","/customer-1.0.0.jar"]