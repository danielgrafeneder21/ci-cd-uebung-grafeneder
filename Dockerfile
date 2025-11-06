# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-21 AS build
LABEL authors="DGraf"
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Build with tests
RUN mvn -B -DskipTests=false clean package


# Stage 2: Runtime
FROM eclipse-temurin:21-jre AS runtime
WORKDIR /app

# copy jar from previous stage
COPY --from=build /app/target/*-shaded.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]