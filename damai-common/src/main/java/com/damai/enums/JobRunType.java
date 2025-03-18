package com.damai.enums;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: job运行类型
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public enum JobRunType {
    /**
     * 同步执行
     * */
    SYNC_RUN,
    
    /**
     * 异步执行
     * */
    ASYNC_RUN;
    
    JobRunType() {
       
    }
    
}
