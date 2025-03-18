package com.damai;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.stream.ObjectRecord;
import org.springframework.data.redis.connection.stream.RecordId;
import org.springframework.data.redis.connection.stream.StreamRecords;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redis-stream发送消息
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Slf4j
@AllArgsConstructor
public class RedisStreamPushHandler {

    
    private final StringRedisTemplate stringRedisTemplate;
    
    private final RedisStreamConfigProperties redisStreamConfigProperties;

    public RecordId push(String msg){
        ObjectRecord<String, String> record = StreamRecords.newRecord()
                .in(redisStreamConfigProperties.getStreamName())
                .ofObject(msg) 
                .withId(RecordId.autoGenerate());
        RecordId recordId = this.stringRedisTemplate.opsForStream().add(record);
        log.info("redis streamName : {} message : {}", redisStreamConfigProperties.getStreamName(),msg);
        return recordId;
    }
}
