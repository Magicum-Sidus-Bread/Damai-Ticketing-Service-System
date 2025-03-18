package com.damai.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import static com.damai.constant.Constant.SERVER_GRAY;


/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: feign扩展插件配置类
 * @author: Magicum Sidus（Niuzhongyu）
 **/

public class ExtraFeignAutoConfiguration {
    
    @Value(SERVER_GRAY)
    public String serverGray;
    
    @Bean
    public FeignRequestInterceptor feignRequestInterceptor(){
        return new FeignRequestInterceptor(serverGray);
    }
}
