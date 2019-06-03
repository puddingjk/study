package org.puddingjk.kafka2;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * kafka消费者
 */
@Component
public class Kafka2Consumer {

    @KafkaListener(topics = {"kafka2Log"})
    public void consumer(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("======================kafka2接收到消息:"+message.toString());
        }
    }
}
