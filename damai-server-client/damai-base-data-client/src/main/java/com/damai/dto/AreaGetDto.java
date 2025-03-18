package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 地区查询 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="AreaGetDto", description ="AreaGetDto")
public class AreaGetDto {
    
    @Schema(name ="id", type ="Long",description="地区id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}
