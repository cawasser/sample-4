FROM openjdk:8-alpine

COPY target/uberjar/sample-4.jar /sample-4/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/sample-4/app.jar"]
