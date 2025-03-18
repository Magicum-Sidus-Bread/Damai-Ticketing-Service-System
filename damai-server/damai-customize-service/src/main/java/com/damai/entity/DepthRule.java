package com.damai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.damai.data.BaseTableData;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 深度规则 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@TableName("d_depth_rule")
public class DepthRule extends BaseTableData implements Serializable {
    
    private Long id;
    
    private String startTimeWindow;
    
    private String endTimeWindow;

    private Integer statTime;
    
    private Integer statTimeType;
    
    private Integer threshold;
    
    private Integer effectiveTime;
    
    private Integer effectiveTimeType;
    
    private String limitApi;
    
    private String message;
}
