package com.damai.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: bean覆盖配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class SpringEnvironment implements EnvironmentPostProcessor {
    
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        application.setAllowBeanDefinitionOverriding(true);
    }
}
