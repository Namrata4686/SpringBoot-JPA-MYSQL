FROM openjdk:11
EXPOSE 8086
ARG target/spring-boot-mysql-dockerized.jar spring-boot-mysql-dockerized.jar
ENTRYPOINT ["java","-jar","spring-boot-mysql-dockerized.jar"]