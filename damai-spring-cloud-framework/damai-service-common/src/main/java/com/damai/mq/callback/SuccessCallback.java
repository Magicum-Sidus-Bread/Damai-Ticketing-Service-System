package com.damai.mq.callback;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于执行成功的情况
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@FunctionalInterface
public interface SuccessCallback<T> {
    
    /**
     * 执行逻辑
     * @param result 执行成功的结果当做参数传递
     * */
    void onSuccess(T result);

}
