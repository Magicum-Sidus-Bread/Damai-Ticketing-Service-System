package com.damai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 熔断
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@RestController
public class HystrixFallBackController {

    @RequestMapping(value = "/fallBackHandler")
    public String fallBackHandler(){
        return "熔断器执行";
    }
}
