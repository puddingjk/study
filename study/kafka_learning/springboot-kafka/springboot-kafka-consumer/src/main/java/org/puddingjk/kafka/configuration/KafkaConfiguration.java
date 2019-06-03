package org.puddingjk.kafka.configuration;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
public class KafkaConfiguration {

    public void sss(){
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "");//xxx服务器ip
//        props.put("acks", "all");//所有follower都响应了才认为消息提交成功，即"committed"
//        props.put("retries", 0);//retries = MAX 无限重试，直到你意识到出现了问题:)
//        props.put("batch.size", 16384);//producer将试图批处理消息记录，以减少请求次数.默认的批量处理消息字节数
//        //batch.size当批量的数据大小达到设定值后，就会立即发送，不顾下面的linger.ms
//        props.put("linger.ms", 1);//延迟1ms发送，这项设置将通过增加小的延迟来完成--即，不是立即发送一条记录，producer将会等待给定的延迟时间以允许其他消息记录发送，这些消息记录可以批量处理
//        props.put("buffer.memory", 33554432);//producer可以用来缓存数据的内存大小。
//        props.put("key.serializer",
//                "org.apache.kafka.common.serialization.IntegerSerializer");
//        props.put("value.serializer",
//                "org.apache.kafka.common.serialization.StringSerializer");
//        new KafkaAutoConfiguration(properties,);
    }
    private static String brokers;

    @Bean
    public KafkaTemplate<String, String> kafkaTemplateCustom() {
        KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<String, String>(producerFactory());
        return kafkaTemplate;
    }

    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers);
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 65536);
        properties.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 524288);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<String, String>(properties);
    }
}
