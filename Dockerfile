FROM openjdk:13
EXPOSE 8083
ADD target/spring-test.jar spring-test.jar
ENTRYPOINT ["java","-jar","/spring-test.jar"]
