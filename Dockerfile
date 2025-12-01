FROM eclipse-temurin:11-jdk
MAINTAINER MSHAIK<masthan.shaik2026@gmail.com>
COPY "/target/demo.jar" "/usr/local/demo.jar"
WORKDIR /usr/local
ENTRYPOINT ["java","-jar","demo.jar"]
