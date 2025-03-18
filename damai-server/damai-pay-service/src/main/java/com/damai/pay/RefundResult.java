package com.damai.pay;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 退款结果
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@AllArgsConstructor
public class RefundResult {
    
    private final boolean success;
    
    private final String body;
    
    private final String message;
}
