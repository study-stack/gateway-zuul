FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/gateway-zuul-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} gateway-zuul.jar

EXPOSE 8080

CMD ["java","-jar","/gateway-zuul.jar"]