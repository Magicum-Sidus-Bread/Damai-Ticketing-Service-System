package com.damai.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 过滤器配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/

public class FilterAutoConfiguration {
    
    @Bean
    @Order(-10)
    public RequestWrapperFilter requestWrapperFilter(){
        return new RequestWrapperFilter();
    }
    
    @Bean
    @Order(1)
    public BaseParameterFilter baseParameterFilter(){
        return new BaseParameterFilter();
    }
}
