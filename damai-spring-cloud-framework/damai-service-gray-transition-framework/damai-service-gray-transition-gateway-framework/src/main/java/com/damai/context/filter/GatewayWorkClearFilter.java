package com.damai.context.filter;


import com.damai.context.impl.GatewayContextHolder;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: GatewayContextHolder数据清除
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class GatewayWorkClearFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(final ServerWebExchange exchange, final GatewayFilterChain chain) {
        GatewayContextHolder.removeCurrentGatewayContext();
        return chain.filter(exchange);
    }
    
    @Override
    public int getOrder() {
        return LOWEST_PRECEDENCE - 1;
    }
}
