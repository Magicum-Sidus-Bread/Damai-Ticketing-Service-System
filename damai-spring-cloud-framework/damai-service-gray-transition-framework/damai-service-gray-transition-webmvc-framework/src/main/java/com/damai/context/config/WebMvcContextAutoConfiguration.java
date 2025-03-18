package com.damai.context.config;

import com.damai.context.ContextHandler;
import com.damai.context.impl.WebMvcContextHandler;
import org.springframework.context.annotation.Bean;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: WebMvc配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class WebMvcContextAutoConfiguration {
    
    @Bean
    public ContextHandler webMvcContext(){
        return new WebMvcContextHandler();
    }
}
