package com.damai.initialize.base;

import jakarta.annotation.PostConstruct;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_POST_CONSTRUCT;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于处理 {@link PostConstruct} 类型 初始化执行 抽象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public abstract class AbstractApplicationPostConstructHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_POST_CONSTRUCT;
    }
}
