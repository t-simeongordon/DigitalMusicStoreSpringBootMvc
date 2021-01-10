FROM openjdk:11
EXPOSE 8082
#adds a jar and locate jar from docker container
ADD target/DigitalMusicStoreSpringBootMvc-0.0.1-SNAPSHOT.jar DigitalMusicStoreSpringBootMvc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "DigitalMusicStoreSpringBootMvc-0.0.1-SNAPSHOT.jar"]