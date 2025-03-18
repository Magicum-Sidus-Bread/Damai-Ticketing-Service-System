package com.damai.kafka;

import com.alibaba.fastjson.JSON;
import com.damai.entity.ApiData;
import com.damai.service.ApiDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.damai.constant.Constant.SPRING_INJECT_PREFIX_DISTINCTION_NAME;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: kafka 消费
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Slf4j
@AllArgsConstructor
@Component
public class ApiDataMessageConsumer {
    
    @Autowired
    private ApiDataService apiDataService;
    
    @KafkaListener(topics = {SPRING_INJECT_PREFIX_DISTINCTION_NAME+"-"+"${spring.kafka.topic:save_api_data}"})
    public void consumerOrderMessage(ConsumerRecord<String,String> consumerRecord){
        try {
            Optional.ofNullable(consumerRecord.value()).map(String::valueOf).ifPresent(value -> {
                log.info("consumerOrderMessage message:{}",value);
                ApiData apiData = JSON.parseObject(value, ApiData.class);
                apiDataService.saveApiData(apiData);
            });
        }catch (Exception e) {
            log.error("consumerApiDataMessage error",e);
        }
    }
}
