FROM openjdk:17-jdk-alpine
ADD target/productPage-0.0.1-SNAPSHOT.jar productPage.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","productPage.jar"]