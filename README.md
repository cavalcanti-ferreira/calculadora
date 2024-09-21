
# Calculadora de pontos para professores da rede pública municipal de São Paulo
This project was implemented using the following tecnologies:
```
Java 17 (oracle-graalvm-17.0.7)
Spring Boot 3.2.0-SNAPSHOT (Newer versions fail to execute after building the native binary)
Thymeleaf 3.3.3
sqlite 3.46
```


# Building the jar
In order to build a jar from the code, run the following command from the root directory of the project
```shell
$ ./gradlew bootJar
```


# Building the native executable
To build a native executable from the JAR file produced prevoiusly, run the following command from the root folder of the repository
```shell
$ ./gralew nativeCompile
```


# Run the executable
```shell
# From the project root folder
$ ./build/native/nativeCompile/calculadora-aot-api
```


# Dockerize the executable
```dockerfile
# Dockerfile (must be located in the same folder as the binary)
FROM debian:bookworm-slim
COPY calculadora-aot-api /usr/bin/
ENTRYPOINT ["/bin/bash", "-c", "/usr/bin/calculadora-aot-api"]
```
```shell
# Commands to build the image
$ docker build -t username/my-image-name .
$ docker run -p 8080:8080 calculadora-aot
```
```shell
# To execute it locally in the browser
localhost:8080
```


# Push to Docker Hub
```shell
$ docker login --username username
$ docker tag my-image-name username/my-repo
$ docker push username/my-repo
```

