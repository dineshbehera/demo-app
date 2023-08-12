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

## Build and run  Commands in cmd:

Build and run
<br>
`mvn clean install`
<br><br>
run only
<br>
`mvn spring-boot:run`
<br>
<br>
run after  jar file is created in target folder
<br>
`java -jar target/demo-app-0.0.1-SNAPSHOT.jar`
<br>
<br>
run after jar file is created in target folder - (active profile tst/prd)
<br>
``java -jar -Dspring.profiles.active=tst target/demo-app-0.0.1-SNAPSHOT.jar spring.active.profile=tst``

## Docker Commands :
`mvn clean package`

`docker login` => login to docker hub

`docker build -t demo-app:latest .`

`docker push demo-app:latest`



docker pull <<image path>>
<br>
`docker pull demo-app`

`docker run -d -p 8080:8080 --name demo-app demo-app:latest`
  
tst
<br>
`docker run -d -p 8081:8080 --name demo-app-tst -e "SPRING_PROFILES_ACTIVE=tst" demo-app:latest`
  
prod
<br>
`docker run -d -p 8082:8080 --name demo-app-prod -e "SPRING_PROFILES_ACTIVE=prod" demo-app:latest`
<br>
<br>
Open 
[http:localhost:8080](http:localhost:8080)

## Kubernetes :
Ingress: It let the external access to the services inside the Kubernetes cluster
Service: It is the endpoint by which external access is given to the application(pods). Without a service, only pods can communicate in the cluster

We can expose 

## kubernetes Commands:

Optional :   `kubectl create namespace local-dev`
<br>

`kubectl -n local-dev get nodes -o wide`
 <br>
 `kubectl -n local-dev get deployments -o wide`
 <br>
 `kubectl -n local-dev get pods -o wide`
 <br>
 `kubectl -n local-dev get services -o wide`
<br>

Undeploy:
<br>
`kubectl delete -f k8.yaml`


Deploy :
<br>
 `kubectl -n local-dev create deployment demo-app-manual --image=demo-app:latest`
 
 or 
 `kubectl -n local-dev create -f k8.yaml`

or <br>
  deploy manually through UI

`kubectl -n local-dev get deployments` <br>
`kubectl -n local-dev get services`


`kubectl -n local-dev get pods`

`kubectl -n local-dev get pods -o wide`

`kubectl -n local-dev describe pod <<pod name>>`

`kubectl get service --all-namespaces`



we can see that our service "demo-app-svc" is running, but the external IP address is `<pending>` status . To expose the service, execute the below command
`minikube -n local-dev service demo-app-svc`

 it will open the URL automatically. if not, execute the below command :
 `minikube -n local-dev service --all`


`kubectl -n development logs <<pod name>>`

`kubectl -n local-dev get pods`

