FROM adoptopenjdk/openjdk14:alpine-slim
COPY target/CICDStudentProgram.jar CICDStudentProgram.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "CICDStudentProgram.jar"]
