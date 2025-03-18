package com.damai.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 过滤器配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class FilterConfig {

    @Bean
    public OncePerRequestFilter requestParamContextFilter(){
        return new RequestParamContextFilter();
    }
}
