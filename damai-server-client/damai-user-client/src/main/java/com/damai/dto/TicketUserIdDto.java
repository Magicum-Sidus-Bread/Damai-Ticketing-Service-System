package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 购票人id dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="TicketUserIdDto", description ="购票人id入参")
public class TicketUserIdDto {
    
    @Schema(name ="id", type ="Long", description ="购票人id", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}