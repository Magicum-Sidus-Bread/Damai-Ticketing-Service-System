package com.damai.pay;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 支付状态查询 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class TradeResult {
    
    private boolean success;
    
    private Integer payBillStatus;
    
    private String outTradeNo;
    
    private BigDecimal totalAmount;
}
