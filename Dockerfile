FROM openjdk:11
MAINTAINER MSHAIK<masthan.shaik2026@gmail.com>
COPY "/target/demo.jar" "/usr/local/demo.jar"
WORKDIR /usr/local
ENTRYPOINT ["java","-jar","demo.jar"]
