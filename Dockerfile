FROM openjdk:17
EXPOSE 9090
ADD target/calc.jar calc.jar
ENTRYPOINT ["java", "-jar", "/calc.jar"]