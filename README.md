# spring-cloud-client
This is an example to use Spring Cloud / API Rest

# Architecture
<b>config-service:</b> This microservice is used to load all configurations of all microservice projects involved.
  It`s necessery to use a git repository, in this exemple I used my repository https://github.com/iurimaia/microservices-config.git. You can access http://localhost:8888/client-service/default to see the client-service config and http://localhost:8888/eureka-service/default to see the eureka-service config.
  
<b>eureka-service:</b> This microservice is used to discovery all microservices as you put an anotation @EnableEurekaClient, this microservice "substitute" a DNS. When you use eureka-service is not necessery to know where is yours applications run. You can access http://localhost:8761/ to see what instances currently registered on Eureka.
  
<b>client-service:</b> This microservice is used to create an API Rest to persist clients (listAll, add, update and delete). 



