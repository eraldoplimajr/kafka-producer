package br.com.eraldolima.kafka_producer.service;

import br.com.eraldolima.kafka_producer.record.OrderRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, OrderRecord> kafkaTemplate;


    private final Random random = new Random();

    public void sendMenssageOrder(OrderRecord order) {

        int partition = random.nextInt(2);


        System.out.println("Sent message to partition: " + partition);
        System.out.println("Send Order: " + order.name());

        kafkaTemplate.send("order-processed-topic", partition, null, order);

    }
}
