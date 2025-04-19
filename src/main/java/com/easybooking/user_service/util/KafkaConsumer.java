package com.easybooking.user_service.util;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "user-topic", groupId = "user-group")
    public void listen(String message) {
        System.out.println("Received Message in user-service: " + message);
    }
}
