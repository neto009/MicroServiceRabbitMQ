package com.iftm.genericStore.message;

import com.iftm.genericStore.entities.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageProduct {

    @Value("genericStore.rabbitmq.exchange")
    String exchange;

    @Value("genericStore.rabbitmq.routingkey")
    String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage (Product product) {
        rabbitTemplate.convertAndSend(exchange, routingKey, product);
    }
}
