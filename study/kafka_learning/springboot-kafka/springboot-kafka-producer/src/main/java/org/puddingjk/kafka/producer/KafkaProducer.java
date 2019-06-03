package org.puddingjk.kafka.producer;

import org.puddingjk.kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Date;
import java.util.UUID;

@Component
@EnableScheduling
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;


    /**
     * 定时任务
     */
    @Scheduled(cron = "00/1 * * * * ?")
    public void send(){
        Message msg = new Message();
        msg.setId(System.currentTimeMillis());
        msg.setMsg(UUID.randomUUID().toString());
        msg.setSendTime(new Date());
        ListenableFuture future = kafkaTemplate.send("testLog", msg.toString());
        future.addCallback(o -> System.out.println("send-消息发送成功：" + msg.toString()), throwable -> System.out.println("消息发送失败：" + msg.toString()));
    }
}
