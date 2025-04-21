#!/bin/bash

SONAR_HOST="http://localhost:9000"
SONAR_TOKEN="squ_d392b66879ff86b7d034b4844d6869451e1d47e5"

services=("user-service" "reservation-service" "room-service" "oauth-service")

for service in "${services[@]}"
do
  echo "Running SonarQube scan for $service..."
  (cd "$service" && ./gradlew sonarqube \
    -Dsonar.projectKey=$service \
    -Dsonar.host.url=$SONAR_HOST \
    -Dsonar.login=$SONAR_TOKEN)
done
