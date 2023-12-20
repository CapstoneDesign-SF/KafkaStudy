package com.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public TestProducer(KafkaTemplate<String, Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void create(){
        kafkaTemplate.send("topic", "say hello~");
    }
}
