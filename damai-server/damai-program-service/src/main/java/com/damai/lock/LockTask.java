package com.damai.lock;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 锁的任务
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@FunctionalInterface
public interface LockTask<V> {
    /**
     * 执行锁的任务
     * @return 结果
     */
    V execute();
}