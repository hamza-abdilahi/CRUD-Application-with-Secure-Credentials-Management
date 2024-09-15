# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY --from=build /app/target/CRUD-Application-0.0.1-SNAPSHOT.jar crud-app.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "crud-app.jar"]

# Expose port 8080 (or the port your application uses)
EXPOSE 8080


