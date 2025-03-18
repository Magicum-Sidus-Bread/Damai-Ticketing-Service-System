package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 交易状态 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="TradeCheckDto", description ="交易状态入参")
public class TradeCheckDto implements Serializable {
    
    @Schema(name ="outTradeNo", type ="String", description ="商户订单号", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String outTradeNo;
    
    @Schema(name ="channel", type ="Integer", description ="支付渠道 alipay：支付宝 wx：微信",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String channel;
}
