# Use image with Java 17
FROM openjdk:25-slim

WORKDIR /the/workdir/path

# Use the jar file from project directory to /app container's directory
COPY target/peaceapp-0.0.1-SNAPSHOT.jar /app/peaceapp.jar

# Expose the port 
EXPOSE 3000

# Command to execute the build
CMD ["java", "-jar", "/app/peaceapp.jar"]