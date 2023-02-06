FROM openjdk:11
COPY target/vehicle-*.jar /vehicle.jar
ENTRYPOINT ["java", "-jar", "/vehicle.jar"]