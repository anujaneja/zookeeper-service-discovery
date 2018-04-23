# zookeeper-service-discovery

Commands to run service providers

  $ cd service-provider/ <br/>
  $ java -jar -Dspring.profiles.active=s1 target/service-provider-0.0.1-SNAPSHOT.jar <br/>
  $ java -jar -Dspring.profiles.active=s2 target/service-provider-0.0.1-SNAPSHOT.jar <br/>
  $ java -jar -Dspring.profiles.active=s3 target/service-provider-0.0.1-SNAPSHOT.jar <br/>
  <br/>
Commands to run service consumer:<br/><br/>

  $ cd ../service-consumer/   <br/>
  $ java -jar target/service-consumer-0.0.1-SNAPSHOT.jar   <br/>
  <br/>
  Access the using below URL:-   <br/><br/>
  
  http://localhost:8083/call-service1    
  <br/>


