package com.damai.context.config;

import com.damai.context.ContextHandler;
import com.damai.context.filter.GatewayWorkClearFilter;
import com.damai.context.filter.GatewayWorkRouteFilter;
import com.damai.context.impl.GatewayContextHandler;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: Gateway配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class GatewayContextAutoConfiguration {
    
    @Bean
    public GlobalFilter gatewayWorkRouteFilter() {
        return new GatewayWorkRouteFilter();
    }
    
    @Bean
    public GlobalFilter gatewayWorkClearFilter() {
        return new GatewayWorkClearFilter();
    }
    
    @Bean
    public ContextHandler webMvcContext(){
        return new GatewayContextHandler();
    }
}
