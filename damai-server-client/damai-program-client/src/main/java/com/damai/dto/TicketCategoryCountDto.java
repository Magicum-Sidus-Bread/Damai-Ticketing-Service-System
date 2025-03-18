package com.damai.dto;

import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 票据数据操作 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class TicketCategoryCountDto {
    
    /**
     * 票档id
     * */
    private Long ticketCategoryId;
    
    /**
     * 数量
     * */
    private Long count;
}
