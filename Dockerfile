FROM gradle:7.6.1-jdk17 AS builder

WORKDIR /app

COPY build.gradle settings.gradle ./

COPY src ./src

RUN ./gradlew clean build -x test --no-daemon

FROM eclipse-temurin:17-jre-focal

WORKDIR /app

EXPOSE 8080

COPY --from=builder /app/build/libs/api-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "/app/api-0.0.1-SNAPSHOT.jar"]