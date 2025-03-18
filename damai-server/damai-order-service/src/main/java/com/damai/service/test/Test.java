package com.damai.service.test;

import com.alibaba.fastjson2.JSON;
import com.damai.core.ConsumerTask;
import com.damai.dto.TestSendDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: Test
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Slf4j
@Service
public class Test implements ConsumerTask {
    
    
    @Override
    public void execute(String content) {
        TestSendDto testSendDto = JSON.parseObject(content, TestSendDto.class);
        log.info("收到消息 : {} 延时: {} 毫秒" ,content,System.currentTimeMillis() - testSendDto.getTime() - 5000);
    }
    
    @Override
    public String topic() {
        return "test-topic";
    }
}
