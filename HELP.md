# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#using.devtools)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#actuator)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

## Docker Commands :
`mvn clean package`
`docker build -t dineshbehera/demo-app:latest .`
`docker push dineshbehera/demo-app:latest`

`docker login` --> login to docker hub

* docker pull <<image path>>
<br>
  `docker pull dineshbehera/demo-app`

    <br>
  `docker run -d -p 8080:8080 --name demo-app dineshbehera/demo-app:latest`

  open http:localhost:8080
  
 ## kubernetes Commands:
 `kubectl -n developemnt get nodes -o wide`
 `kubectl -n development get deployments -o wide`
 `kubectl -n development get pods -o wide`
 `kubectl -n development get services -o wide`


Deploy :
<br>
 `kubectl -n development create deployment demo-app-manual --image=dineshbehera/demo-app:latest`

 or `kubectl -n development create -f k8.yaml`

or deploy manually through UI


`kubectl -n development get services`

we can see that our service "demo-app" is running, but the external IP address is <pending>. To expose the service, execute that command below.
* `minikube -n development service demo-app`

  open URL

  `kubectl -n development get pods`
* kubectl -n development logs <<pod name>>