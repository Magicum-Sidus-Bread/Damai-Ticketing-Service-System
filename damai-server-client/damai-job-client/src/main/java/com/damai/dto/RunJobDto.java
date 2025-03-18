package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: job任务执行 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="RunJobDto", description ="RunJobDto")
public class RunJobDto {
    
    @Schema(name ="id", type ="Long", description ="任务id", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}
