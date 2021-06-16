From openjdk:11
copy ./target/springboot-docker-producer-0.0.1-SNAPSHOT.jar springboot-docker-producer-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springboot-docker-producer-0.0.1-SNAPSHOT.jar"]