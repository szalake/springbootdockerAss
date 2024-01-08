FROM openjdk:11
EXPOSE 8080
ADD /target/ecllipse-docker-demo.jar ecllipse-docker-demo.jar
ENTRYPOINT ["java","-jar","/ecllipse-docker-demo.jar"]
