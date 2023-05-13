# Fetching latest version of Java
FROM openjdk:17-alpine
 
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/demo-app-0.0.1-SNAPSHOT.jar /app

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "demo-app-0.0.1-SNAPSHOT.jar"]