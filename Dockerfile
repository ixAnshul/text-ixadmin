FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY text-ixadmin.jar text-ixadmin.jar
EXPOSE 8082
CMD [ "java", "-jar", "text-ixadmin.jar" ]
