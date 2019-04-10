FROM maven:3-jdk-11
WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn clean install


FROM openjdk:11-jre
WORKDIR /app
COPY --from=0 /app/target/*.jar ./target/
COPY run.sh ./

EXPOSE 8080

CMD ["/app/run.sh"]