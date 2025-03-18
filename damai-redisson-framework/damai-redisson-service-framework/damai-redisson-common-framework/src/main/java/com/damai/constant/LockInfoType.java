package com.damai.constant;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 业务类型
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class LockInfoType {
    
    /***
     * 防重复执行幂等
     */
    public static final String REPEAT_EXECUTE_LIMIT = "repeat_execute_limit";
    
    /***
     * 分布式锁
     */
    public static final String SERVICE_LOCK = "service_lock";
    
}
