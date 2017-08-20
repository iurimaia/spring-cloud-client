# spring-cloud-example
This is an example to use Spring Cloud / API Rest

# Architecture
<b>config-service:</b> Spring Cloud Config provides server and client-side support for externalized configuration in a distributed system.With the Config Server you have a central place to manage external properties for applications across all environments.
  It`s necessery to use a git repository, in this exemple I used my repository https://github.com/iurimaia/microservices-config.git. You can access http://localhost:8888/client-service/default to see the client-service config and http://localhost:8888/eureka-service/default to see the eureka-service config.
  
<b>eureka-service:</b> Eureka instances can be registered and clients can discover the instances using Spring-managed beans. You can access http://localhost:8761/ to see what instances currently registered on Eureka.
  
<b>client-service:</b> This microservice is used to create an API Rest to persist a clients just a name (listAll, add, update and delete). 



