package com.damai;

import org.springframework.data.redis.connection.stream.ObjectRecord;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redis-stream消息处理
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@FunctionalInterface
public interface MessageConsumer {
    
    /**
     * 消息处理
     * @param message 消息
     * 
     * */
    void accept(ObjectRecord<String, String> message);
}