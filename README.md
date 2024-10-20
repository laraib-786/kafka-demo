# kafka-demo
How to run:
1. Run `docker-compose up` in the path where docker-compose.yml file present.
2. In the terminal
   - Go inside the container: 
       `docker exec -it kafka1 bash`
   - Create a topic "test-topic"  
       `kafka-topics --bootstrap-server kafka1:9092 --create --topic test-topic --replication-factor 1 --partitions 1`
   - Check if topic has been created  
       `kafka-topics --describe --topic test_topic --bootstrap-server localhost:9092`
   - Produce messages to the topic  
       `kafka-console-producer --bootstrap-server kafka1:9092 --topic test-topic`
   - Consume messages from the topic  
       `kafka-console-consumer --bootstrap-server kafka1:9092 --topic test-topic --from-beginning`
3. How to check spring boot kafka integration is done?  
   - After running the application, check whether group id is present in the kafka by using the command    
     `docker exec -it kafka1 kafka-consumer-groups --bootstrap-server localhost:9092 --group group_id --describe`    
   - To check all the list of groups  
     `exec -it kafka1 kafka-consumer-groups --bootstrap-server localhost:9092 --list`
  
