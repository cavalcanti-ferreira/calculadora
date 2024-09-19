# Spring-Native-GraalVM
Repository to demonstrate native deployment of spring boot based microservice

# Pre requisites
Install GraalVM from [here](https://www.graalvm.org/latest/docs/getting-started/)

# Building the jar
Inorder to build a jar from the code run the following command from the root of the repository

```
./gradlew bootJar
```
# Building the native executable
Inorder to build a native executable from the code run the following command from the root of the repository

```
./gralew nativeCompile
```
