package com.damai.service.redisstreamconsumer;

import com.damai.MessageConsumer;
import com.damai.service.ProgramService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.stream.ObjectRecord;
import org.springframework.stereotype.Component;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redis-stream消息消费
 * @author: Magicum Sidus（Niuzhongyu）
 **/    
@Slf4j
@Component
public class ProgramRedisStreamConsumer implements MessageConsumer {
    
    @Autowired
    private ProgramService programService;
    
    @Override
    public void accept(ObjectRecord<String, String> message) {
        Long programId = Long.parseLong(message.getValue());
        programService.delLocalCache(programId);
    }
}
