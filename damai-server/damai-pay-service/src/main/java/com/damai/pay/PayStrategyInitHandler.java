package com.damai.pay;

import com.damai.initialize.base.AbstractApplicationInitializingBeanHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;
import java.util.Map.Entry;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 支付策略初始化
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@AllArgsConstructor
public class PayStrategyInitHandler extends AbstractApplicationInitializingBeanHandler {
    
    private final PayStrategyContext payStrategyContext;
    
    @Override
    public Integer executeOrder() {
        return 1;
    }
    
    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        Map<String, PayStrategyHandler> payStrategyHandlerMap = context.getBeansOfType(PayStrategyHandler.class);
        for (Entry<String, PayStrategyHandler> entry : payStrategyHandlerMap.entrySet()) {
            PayStrategyHandler payStrategyHandler = entry.getValue();
            payStrategyContext.put(payStrategyHandler.getChannel(),payStrategyHandler);
        }
    }
}
