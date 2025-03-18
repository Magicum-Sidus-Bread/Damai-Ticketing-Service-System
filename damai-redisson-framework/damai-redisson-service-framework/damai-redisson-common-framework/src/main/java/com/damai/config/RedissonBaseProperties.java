package com.damai.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redisson属性配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@ConfigurationProperties(prefix = "spring.redis.redisson")
public class RedissonBaseProperties {

    private Integer threads = 16;
    
    private Integer nettyThreads = 32;
    
    private Integer corePoolSize = null;
   
    private Integer maximumPoolSize = null;
    
    private long keepAliveTime = 30;
    
    private TimeUnit unit = TimeUnit.SECONDS;
  
    private Integer workQueueSize = 256; 
}
