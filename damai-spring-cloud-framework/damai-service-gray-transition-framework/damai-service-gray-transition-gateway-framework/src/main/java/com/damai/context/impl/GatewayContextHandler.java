package com.damai.context.impl;

import com.damai.context.ContextHandler;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import java.util.Optional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: Gateway上下文获取实现
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class GatewayContextHandler implements ContextHandler {
    @Override
    public String getValueFromHeader(final String name) {
        return Optional.ofNullable(getServerHttpRequest())
                .map(request -> request.getHeaders().getFirst(name))
                .orElse(null);
    }
    
    public ServerWebExchange getExchange() {
        return GatewayContextHolder.getCurrentGatewayContext().getExchange();
    }
    
    public ServerHttpRequest getServerHttpRequest() {
        return Optional.ofNullable(getExchange()).map(ServerWebExchange::getRequest).orElse(null);
    }
}
