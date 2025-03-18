package com.damai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.damai.data.BaseTableData;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: api调用记录 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@TableName("d_api_data")
public class ApiData extends BaseTableData implements Serializable {
    
    private Long id;
    
    private String headVersion;
    
    private String apiAddress;
    
    private String apiMethod;
    
    private String apiBody;
    
    private String apiParams;
    
    private String apiUrl;
    
    private String callDayTime;
    
    private String callHourTime;
    
    private String callMinuteTime;
    
    private String callSecondTime;
    
    private Integer type;
}
