package com.damai.pro.limit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 线上限流工具配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Configuration
public class RateLimiterConfig {
    
    @Bean
    public RateLimiterProperty rateLimiterProperty(){
        return new RateLimiterProperty();
    }
    
    @Bean
    public RateLimiter rateLimiter(RateLimiterProperty rateLimiterProperty){
        return new RateLimiter(rateLimiterProperty.getRatePermits());
    }
}
