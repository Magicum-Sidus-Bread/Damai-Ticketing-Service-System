package com.damai.entity;

import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 购票人订单聚合统计 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class OrderTicketUserAggregate {
    
    private Long orderNumber;
    
    private Integer orderTicketUserCount;
}
