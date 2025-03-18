package com.damai.config;

import com.damai.handler.BloomFilterHandler;
import org.redisson.api.RedissonClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 布隆过滤器 配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@EnableConfigurationProperties(BloomFilterProperties.class)
public class BloomFilterAutoConfiguration {
    
    /**
     * 布隆过滤器
     */
    @Bean
    public BloomFilterHandler rBloomFilterUtil(RedissonClient redissonClient, BloomFilterProperties bloomFilterProperties) {
        return new BloomFilterHandler(redissonClient, bloomFilterProperties);
    }
}
