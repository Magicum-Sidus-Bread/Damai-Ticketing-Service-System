package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 广播调用 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="BroadcastCallDto", description ="广播调用")
public class BroadcastCallDto {
    
    @Schema(name ="serviceName", type ="String", description ="服务名", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String serviceName;
    
    @Schema(name ="requestBody", type ="String", description ="请求体", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String requestBody;
}
