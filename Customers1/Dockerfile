FROM openjdk:8
ARG JAR_FILE=target/Customers-1.0.0.jar
COPY ${JAR_FILE} sample.jar
ENTRYPOINT ["java", "-jar", "sample.jar"]