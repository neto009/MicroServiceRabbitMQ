package com.iftm.saleStore.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageConfig {
        @Value("genericStore.rabbitmq.exchange")
        String exchange;

        @Autowired
        private RabbitTemplate rabbitTemplate;

        public void sendMessage(Product product) {
            rabbitTemplate.convertAndSend(exchange, routingKey, product);
        }
}
