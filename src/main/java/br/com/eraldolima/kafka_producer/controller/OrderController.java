package br.com.eraldolima.kafka_producer.controller;

import br.com.eraldolima.kafka_producer.record.OrderRecord;
import br.com.eraldolima.kafka_producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> createOrder(@RequestBody OrderRecord order){

        orderService.sendMenssageOrder(order);

        return ResponseEntity.ok().build();

    }

}
