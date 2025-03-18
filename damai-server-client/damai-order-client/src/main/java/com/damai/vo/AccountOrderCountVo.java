package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 账户下订单数量 vo
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="AccountOrderCountVo", description ="账户下订单数量")
public class AccountOrderCountVo {
    
    @Schema(name ="count", type ="Integer", description ="账户下的订单数量")
    private Integer count;
}
