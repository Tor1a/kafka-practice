package org.example.kafkaconsumerpractice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "testTopic", groupId = "myGroup")
    public void consume(String message) {
        System.out.println("Received message" + message);
    }
}
