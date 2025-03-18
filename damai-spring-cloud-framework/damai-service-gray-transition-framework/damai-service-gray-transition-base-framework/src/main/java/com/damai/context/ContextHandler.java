package com.damai.context;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 上下文获取抽象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface ContextHandler {
    
    /***
     * 从request请求头获取值
     * @param name 值的名
     * @return 具体值
     * 
     */
    String getValueFromHeader(String name);
}