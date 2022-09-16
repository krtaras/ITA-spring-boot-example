FROM amazoncorretto:11-alpine-jdk as builder

RUN apk add maven
COPY . .
RUN mvn install

FROM amazoncorretto:11-alpine-jdk
COPY --from=builder ./target/app.jar ./app.jar
CMD ["java","-jar","./app.jar"]
