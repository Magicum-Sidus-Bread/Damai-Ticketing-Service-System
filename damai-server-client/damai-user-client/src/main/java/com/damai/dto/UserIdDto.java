package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用户id dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="UserIdDto", description ="用户id入参")
public class UserIdDto {
    
    @Schema(name ="id", type ="Long", description ="用户id", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}