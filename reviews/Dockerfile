FROM openjdk:17-jdk-alpine
ADD target/reviews-0.0.1-SNAPSHOT.jar reviews.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","reviews.jar"]