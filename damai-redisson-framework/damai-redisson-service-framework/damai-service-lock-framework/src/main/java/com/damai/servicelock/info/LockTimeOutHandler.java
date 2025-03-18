package com.damai.servicelock.info;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分布式锁 处理失败抽象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface LockTimeOutHandler {
    
    /**
     * 处理
     * @param lockName 锁名
     * */
    void handler(String lockName);
}
