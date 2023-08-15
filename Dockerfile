FROM openjdk:21
COPY target/java_mv.jar java_mv.jar
CMD java -jar java_mv.jar