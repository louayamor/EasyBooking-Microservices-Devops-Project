<<<<<<< HEAD
<<<<<<< HEAD
FROM nginx:latest
COPY default.conf /etc/nginx/conf.d/default.conf
=======
=======
>>>>>>> origin/reservation-service
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY build/libs/*.jar app.jar

<<<<<<< HEAD
EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
>>>>>>> origin/oauth-security
=======
EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]
>>>>>>> origin/reservation-service
