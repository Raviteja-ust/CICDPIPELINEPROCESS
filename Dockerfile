FROM openjdk:17
EXPOSE 9091
ADD target/samplecicdapp.jar samplecicdapp.jar
ENTRYPOINT ["java","-jar","/samplecicdapp.jar"]