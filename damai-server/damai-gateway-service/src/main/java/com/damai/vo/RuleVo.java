package com.damai.vo;

import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 普通对象 返回vo
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class RuleVo {
    
    private String id;
    
    private Integer statTime;
    
    private Integer statTimeType;
    
    private Integer threshold;
    
    private Integer effectiveTime;
    
    private Integer effectiveTimeType;
    
    private String limitApi;
    
    private String message;
    
    private Integer status;
}
