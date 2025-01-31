FROM openjdk:17-jdk-alpine
ADD target/ratings-0.0.1-SNAPSHOT.jar ratings.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","ratings.jar"]