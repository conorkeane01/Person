FROM openjdk:17

WORKDIR /app

COPY target/Person-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD  ["java", "jar", "Person-0.0.1-SNAPSHOT.jar"]