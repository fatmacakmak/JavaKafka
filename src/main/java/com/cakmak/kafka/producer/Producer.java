package com.cakmak.kafka.producer;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Value("${kafka.topic}")
    private String topic;
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(Object message){
        this.kafkaTemplate.send(topic,message);
        System.out.println("Producer.Java: Message sending kafka.");
    }
}
