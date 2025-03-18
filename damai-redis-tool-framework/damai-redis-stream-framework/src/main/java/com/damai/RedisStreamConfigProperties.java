package com.damai;

import com.damai.constant.RedisStreamConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redis-stream属性配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@ConfigurationProperties(prefix = RedisStreamConfigProperties.PREFIX)
public class RedisStreamConfigProperties {
    
    public static final String PREFIX = "spring.data.redis.stream";
    
    /**
     * stream名字
     * */
    private String streamName;
    
    /**
     * 消费组名字
     * */
    private String consumerGroup;
    
    /**
     * 消费者名
     * */
    private String consumerName;
    
    /**
     * 消费方式 group:消费组(默认)/broadcast:广播
     */
    private String consumerType = RedisStreamConstant.GROUP;
}

