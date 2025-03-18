package com.damai.servicelock;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分布式锁 锁类型
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public enum LockType {
    /**
     * 可重入锁
     */
    Reentrant,
    /**
     * 公平锁
     */
    Fair,
    /**
     * 读锁
     */
    Read,
    /**
     * 写锁
     */
    Write;

    LockType() {
    }

}
