FROM openjdk:11

EXPOSE 8080

COPY ./target/java-mav-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app 

ENTRYPOINT ["java", "-jar", "java-mav-1.0-SNAPSHOT.jar"] 

