package br.com.eraldolima.kafka_producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {
/*
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public ResponseEntity<Void> realizarVenda(@RequestBody String idProduto) {

        kafkaTemplate.send("", idProduto);

        return ResponseEntity.ok().build();

    }*/



}
