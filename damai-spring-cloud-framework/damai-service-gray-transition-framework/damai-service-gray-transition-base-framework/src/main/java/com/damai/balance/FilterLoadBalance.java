package com.damai.balance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 负载均衡服务过滤接口
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface FilterLoadBalance {
    
    /**
     * 服务过滤操作
     * @param servers 服务列表
     * */
    void selectServer(List<ServiceInstance> servers);
}
