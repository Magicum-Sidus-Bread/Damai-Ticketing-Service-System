package com.damai.mq.callback;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于执行失败的情况
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@FunctionalInterface
public interface FailureCallback {
    
    /**
     * 执行逻辑
     * @param ex 执行失败的异常当做参数传递
     * */
    void onFailure(Throwable ex);

}