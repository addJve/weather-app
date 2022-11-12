FROM openjdk:18

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]


#docker build --platform linux/amd64 -t spring-weatherapp .
#docker run -p 8080:8080 -t spring-weatherapp




#FROM openjdk:18
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]




#FROM openjdk:18
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#COPY start-app.sh .
#ENTRYPOINT ["./start-app.sh"]
#ENTRYPOINT ["java","-jar","/app.jar"]