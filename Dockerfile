FROM adoptopenjdk:11-jre-hotspot
ARG JARFILE=target/*.jar
COPY ${JARFILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]