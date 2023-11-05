package com.cakmak.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "my-first-topic", groupId = "group_id_1")
    public void consumeMessage(Object message) throws NoSuchFieldException {
        System.out.println(message.getClass().getField("value"));
    }
}
