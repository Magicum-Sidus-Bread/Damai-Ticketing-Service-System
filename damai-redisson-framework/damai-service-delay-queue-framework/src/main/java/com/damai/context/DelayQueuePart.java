package com.damai.context;

import com.damai.core.ConsumerTask;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 消息主题
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class DelayQueuePart {
    
    private final DelayQueueBasePart delayQueueBasePart;
 
    private final ConsumerTask consumerTask;
    
    public DelayQueuePart(DelayQueueBasePart delayQueueBasePart, ConsumerTask consumerTask){
        this.delayQueueBasePart = delayQueueBasePart;
        this.consumerTask = consumerTask;
    }
}
