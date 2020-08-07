package com.jmn.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService
{

    private final String GROUP_ID = "group_id";
    private final String TOPIC_NAME = "test";

    private final Logger logger =
            LoggerFactory.getLogger(KafKaConsumerService.class);

    @KafkaListener(topics = TOPIC_NAME,
            groupId =  GROUP_ID)
    public void consume(String message)
    {
        logger.info(String.format("Message recieved -> %s", message));
    }
}