package com.damai.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目 实体 连表使用
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class ProgramJoinShowTime extends Program implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    /**
     * 演出时间
     */
    private Date showTime;
    
    /**
     * 演出时间(精确到天)
     */
    private Date showDayTime;
    
    /**
     * 演出时间所在的星期
     */
    private String showWeekTime;
}
