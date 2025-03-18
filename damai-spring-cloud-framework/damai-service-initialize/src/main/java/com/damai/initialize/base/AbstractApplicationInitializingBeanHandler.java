package com.damai.initialize.base;

import org.springframework.beans.factory.InitializingBean;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_INITIALIZING_BEAN;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于处理 {@link InitializingBean} 类型 初始化执行 抽象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public abstract class AbstractApplicationInitializingBeanHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_INITIALIZING_BEAN;
    }
}
