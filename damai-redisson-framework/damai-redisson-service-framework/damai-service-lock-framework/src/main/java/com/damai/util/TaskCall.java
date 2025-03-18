package com.damai.util;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分布式锁 方法类型执行 有返回值的业务
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@FunctionalInterface
public interface TaskCall<V> {

    /**
     * 执行任务
     * @return 结果
     * */
    V call();
}
