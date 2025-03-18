package com.damai.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: api调用记录 接受参数
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class ApiDataDto {
    
    private Long id;
    
    private String headVersion;
    
    private String apiAddress;
    
    private String apiMethod;
    
    private String apiBody;
    
    private String apiParams;
    
    private String apiUrl;
    
    private Date createTime;
    
    private Integer status;
    
    private String callDayTime;
    
    private String callHourTime;
    
    private String callMinuteTime;
    
    private String callSecondTime;
    
    private Integer type;
    
}
