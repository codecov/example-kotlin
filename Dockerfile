FROM openjdk:8-jdk-alpine

COPY . /src

WORKDIR /src

RUN chmod +x /src/entrypoint.sh
ENTRYPOINT [ "/src/entrypoint.sh" ]