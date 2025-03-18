package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目类型 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="ProgramCategoryDto", description ="节目类型")
public class ProgramCategoryDto {
    
    @Schema(name ="type", type ="Integer", description ="1:一级种类 2:二级种类", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Integer type;
}
