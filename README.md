# Spring Boot 3 - rest demo app

exploring spring boot resources ... 

```
mvn clean pakage
mvn spring-boot:run
mvn test
```

```
curl "http://localhost:8080/greeting?name=eduardo"
curl "http://localhost:8080/product/id/10"
```
or open in a browser:

- http://localhost:8080/greeting
- http://localhost:8080/greeting?name=eduardo

using https://restful-api.dev/ for consuming API using WebClient

- http://localhost:8080/product/id/10


### Links
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


