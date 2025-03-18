package com.damai.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;
    
import jakarta.validation.constraints.NotBlank;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 渠道数据查询 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="GetChannelDataByCodeDto", description ="渠道数据查询")
public class GetChannelDataByCodeDto {
    
    @Schema(name ="code", type ="String", description ="code码",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String code;
    
}