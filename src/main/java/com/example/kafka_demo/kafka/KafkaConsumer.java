package com.example.kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="test-topic", groupId = "group_id")
    public void consumeMessage(String message){

        System.out.println("---------------------------------Received message: " + message);
    }
}
