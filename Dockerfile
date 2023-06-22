FROM openjdk:11
ADD ./target/Claim-Processing-System-0.0.1-SNAPSHOT.jar /usr/src/Claim-Processing-System-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "Claim-Processing-System-0.0.1-SNAPSHOT.jar"]