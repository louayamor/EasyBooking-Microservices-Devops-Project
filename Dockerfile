<<<<<<< HEAD
FROM nginx:latest
COPY default.conf /etc/nginx/conf.d/default.conf
=======
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
>>>>>>> origin/oauth-security
