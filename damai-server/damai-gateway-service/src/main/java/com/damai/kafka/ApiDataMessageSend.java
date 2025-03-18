package com.damai.kafka;

import com.damai.core.SpringUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 数据发送
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Slf4j
@AllArgsConstructor
public class ApiDataMessageSend {
    
    private KafkaTemplate<String, String> kafkaTemplate;
    
    private String topic;
    
    public void sendMessage(String message) {
        log.info("sendMessage message : {}", message);
        kafkaTemplate.send(SpringUtil.getPrefixDistinctionName() + "-" + topic,message);
    }
}
