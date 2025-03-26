FROM amazoncorretto:23-alpine-jdk
COPY target/job-app.jar job-app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "job-app.jar"]