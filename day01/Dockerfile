FROM gradle:alpine as BASE

RUN git clone https://github.com/HerrNaN/aoc21-kt.git /app
WORKDIR /app

RUN gradle build -x test

FROM openjdk:17-alpine
COPY --from=BASE /app/build/libs/kt-1.0.0.jar /kt.jar
RUN export DAY=day01
CMD java -jar /kt.jar
