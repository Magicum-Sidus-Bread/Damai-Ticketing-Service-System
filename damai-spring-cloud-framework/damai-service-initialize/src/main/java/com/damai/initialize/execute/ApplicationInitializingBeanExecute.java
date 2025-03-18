package com.damai.initialize.execute;

import com.damai.initialize.execute.base.AbstractApplicationExecute;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_INITIALIZING_BEAN;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于处理 {@link InitializingBean} 应用程序启动事件。
 * @author: Magicum Sidus（Niuzhongyu）
 **/

public class ApplicationInitializingBeanExecute extends AbstractApplicationExecute implements InitializingBean {
    
    public ApplicationInitializingBeanExecute(ConfigurableApplicationContext applicationContext){
        super(applicationContext);
    }
    
    @Override
    public void afterPropertiesSet() {
        execute();
    }
    
    @Override
    public String type() {
        return APPLICATION_INITIALIZING_BEAN;
    }
}
