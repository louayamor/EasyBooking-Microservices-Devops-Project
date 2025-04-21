package com.easybooking.reservation_service.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${reservation.topic.name}")
    private String topicName;

    public void sendReservationEvent(String message) {
        kafkaTemplate.send(topicName, message);
    }
}
