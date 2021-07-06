package com.example.springapacheconsumer;

import org.springframework.kafka.annotation.KafkaListener;

public class Listener {

    @KafkaListener(id = "listen1", topics = "listener-in")
    public void listen1(String in) {
        System.out.println(in);
    }

}