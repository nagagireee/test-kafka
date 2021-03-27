package com.kkafka.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kkafka.dto.User;



@Service
public class KafkaConsumer {

	
    @KafkaListener(topics = "TOPIC_TEST", groupId = "group_id",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
