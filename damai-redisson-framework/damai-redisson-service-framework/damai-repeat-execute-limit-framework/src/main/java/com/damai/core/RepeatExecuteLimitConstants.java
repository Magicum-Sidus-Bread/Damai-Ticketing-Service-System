package com.damai.core;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 防重复幂等业务名管理
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class RepeatExecuteLimitConstants {
    
    public static final String CONSUMER_API_DATA_MESSAGE = "consumer_api_data_message";
    
    public static final String CREATE_PROGRAM_ORDER = "create_program_order";
   
    public final static String CANCEL_PROGRAM_ORDER = "cancel_program_order";
    
    public static final String CREATE_PROGRAM_ORDER_MQ = "create_program_order_mq";
    
    public static final String PROGRAM_CACHE_REVERSE_MQ = "program_cache_reverse_mq";
}
