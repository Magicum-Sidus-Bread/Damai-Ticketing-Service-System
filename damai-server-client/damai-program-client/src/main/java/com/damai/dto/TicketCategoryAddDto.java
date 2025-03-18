package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目票档添加 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="TicketCategoryAddDto", description ="节目票档添加")
public class TicketCategoryAddDto {
    
    @Schema(name ="programId", type ="Long", description ="节目表id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long programId;
    
    @Schema(name ="introduce", type ="String", description ="介绍",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String introduce;
    
    @Schema(name ="price", type ="BigDecimal", description ="价格",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private BigDecimal price;
    
    @Schema(name ="totalNumber", type ="Long", description ="总数量",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long totalNumber;
    
    @Schema(name ="remainNumber", type ="Long", description ="剩余数量",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long remainNumber;
    
    
}
