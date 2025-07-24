FROM eclipse-temurin:17-jdk-alpine

# create directory  for the app
WORKDIR /app

# copy everythigng from current directory to app direcotry
COPY . .

RUN apk add dos2unix
Run dos2unix ./gradlew
RUN ./gradlew build --stacktrace


# expose port 8082
CMD ["java","-jar","/app/build/libs/source-0.0.1-SNAPSHOT.jar"]