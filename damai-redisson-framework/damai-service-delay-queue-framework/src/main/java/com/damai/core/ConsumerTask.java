package com.damai.core;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 延迟队列 消费者接口
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface ConsumerTask {
    
    /**
     * 消费任务
     * @param content 具体参数
     * */
    void execute(String content);
    /**
     * 主题
     * @return 主题
     * */
    String topic();
}
