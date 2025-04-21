package com.easybooking.room_service.util;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "room-events", groupId = "room-service-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
