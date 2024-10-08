package br.com.eraldolima.kafka_producer.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TopicKafkaConfig {

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAdress;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String,Object> config = new HashMap<>();
        config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAdress);

        return new KafkaAdmin(config);

    }

    @Bean
    public NewTopic topicOrderProcessed() {

        return new NewTopic("order-processed-topic", 2, (short) 1);

    }


}
