package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目数据重置 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="ProgramResetExecuteDto", description ="节目数据重置")
public class ProgramResetExecuteDto {
    
    @Schema(name ="programId", type ="Long", description ="节目id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long programId;
}
