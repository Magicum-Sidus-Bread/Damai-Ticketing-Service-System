package com.damai.context;

import com.damai.config.DelayQueueProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.redisson.api.RedissonClient;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 延迟队列配置信息
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@AllArgsConstructor
public class DelayQueueBasePart {
    
    private final RedissonClient redissonClient;
    
    private final DelayQueueProperties delayQueueProperties;
}
