package com.damai.service;

import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 接口请求记录 实体对象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class ApiRestrictData {

    private Long triggerResult;
    
    private Long triggerCallStat;
    
    private Long apiCount;
    
    private Long threshold;
    
    private Long messageIndex;
}
