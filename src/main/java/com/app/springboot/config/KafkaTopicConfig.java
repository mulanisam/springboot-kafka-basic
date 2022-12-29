package com.app.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("DemoTopic1")
                .build();
    }
    @Bean
    public NewTopic JsonTopic(){
        return TopicBuilder.name("JsonTopic1")
                .build();
    }
}
