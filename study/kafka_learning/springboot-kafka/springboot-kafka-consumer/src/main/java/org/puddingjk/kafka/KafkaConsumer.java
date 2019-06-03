package org.puddingjk.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * kafka消费者
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"testLog"})
    public void consumer(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("kafka1消息消费中..."+message.toString());
            System.out.println("正在转发至kafka2...");
            boolean isSuccess = forWordToKafka(message.toString());
            if(isSuccess){
                System.out.println("转发成功..."+message.toString());
            }
        }
    }

    /**
     * 把消费完成的数据 转发至kafka2
     * @param msg
     * @return
     */
    public boolean forWordToKafka(String msg){
        // 加载 kafka2配置
        System.out.println(msg);
        return true;
    }
}
