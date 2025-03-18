package com.baidu.fsg.uid.config;

import com.baidu.fsg.uid.worker.WorkerIdAssigner;
import com.damai.enums.BaseCode;
import com.damai.exception.DaMaiFrameException;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Optional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: redis配置生成work_id
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class RedisDisposableWorkerIdAssigner implements WorkerIdAssigner {
    
    private RedisTemplate redisTemplate;
    
    public RedisDisposableWorkerIdAssigner (RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
    }
    
    @Override
    public long assignWorkerId() {
        String key = "uid_work_id";
        Long increment = redisTemplate.opsForValue().increment(key);
        return Optional.ofNullable(increment).orElseThrow(() -> new DaMaiFrameException(BaseCode.UID_WORK_ID_ERROR));
    }
}
