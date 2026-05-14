FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project
COPY src .

# Build the project
RUN ./mvnw clean package -DskipTests

# Run the app
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]