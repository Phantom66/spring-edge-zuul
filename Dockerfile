FROM openjdk
ADD target/spring-edge-zuul-0.0.1-SNAPSHOT.jar containerized-gateway.jar
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar"]
EXPOSE 8761


