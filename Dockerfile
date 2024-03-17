# Use Maven to build the application
FROM maven:3.8.4-openjdk-17 as builder
WORKDIR /app
COPY pom.xml .
COPY src src
# Build the application and skip tests to speed up the build process
# Remove '-DskipTests' if you want to run tests
RUN mvn clean package -DskipTests

# Use OpenJDK for the runtime
FROM openjdk:17-slim
WORKDIR /app
# Copy the built jar file from the builder stage
COPY --from=builder /app/target/chat-*.jar /app/chat-app.jar
# Expose the port the application runs on
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "chat-app.jar"]
