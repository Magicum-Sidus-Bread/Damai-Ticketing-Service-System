package com.damai.initialize.impl.composite.init;

import com.damai.initialize.base.AbstractApplicationStartEventListenerHandler;
import com.damai.initialize.impl.composite.CompositeContainer;
import lombok.AllArgsConstructor;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 组合模式初始化操作执行
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@AllArgsConstructor
public class CompositeInit extends AbstractApplicationStartEventListenerHandler {
    
    private final CompositeContainer compositeContainer;
    
    @Override
    public Integer executeOrder() {
        return 1;
    }
    
    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        compositeContainer.init(context);
    }
}
