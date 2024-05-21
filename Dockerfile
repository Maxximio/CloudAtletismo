FROM amazoncorretto:17-alpine-jdk

COPY target/CloudAtletismo.jar app.jar

ENTRYPOINT [ "java","-jar","/app.jar" ]

EXPOSE 8080