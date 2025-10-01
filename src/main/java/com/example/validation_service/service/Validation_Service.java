package com.example.validation_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Validation_Service {

    @KafkaListener(topics = "files_monitored", groupId = "my-KafkaGroup")
    public void getMessage(String Message){
        System.out.println("Received"+Message);
    }
}
