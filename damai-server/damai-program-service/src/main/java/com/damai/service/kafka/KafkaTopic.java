package com.damai.service.kafka;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: kafka topic
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Component
public class KafkaTopic {
    
    @Value("${spring.kafka.topic:default}")
    private String topic;

}
