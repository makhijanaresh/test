FROM openjdk:13
EXPOSE 8080
ADD target/spring-test.jar spring-test.jar
ENTRYPOINT ["java","-jar","/spring-test.jar"]
