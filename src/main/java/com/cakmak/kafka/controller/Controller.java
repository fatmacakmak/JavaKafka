package com.cakmak.kafka.controller;

import com.cakmak.kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class Controller {
    @Autowired
    private ProducerService producerService;

    @GetMapping
    public String healthCheck(@RequestBody String message){
        producerService.send(message);
        return "message";
    }
}
