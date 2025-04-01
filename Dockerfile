# Используем образ OpenJDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл jar в контейнер
COPY build/libs/BakrService-1.0.0.jar bakrservice.jar

# Открываем порт для приложения
EXPOSE 8081

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "bakrservice.jar"]
