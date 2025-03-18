package com.damai.service.strategy;

import com.damai.dto.ProgramOrderCreateDto;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目订单策略
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface ProgramOrderStrategy {
    
    /**
     * 创建订单
     * @param programOrderCreateDto 订单参数
     * @return 订单编号
     * */
    String createOrder(ProgramOrderCreateDto programOrderCreateDto);
}
