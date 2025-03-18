package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目查询 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="ProgramGetDto", description ="节目")
public class ProgramGetDto{
    
    @Schema(name ="id", type ="Long", description ="id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}
