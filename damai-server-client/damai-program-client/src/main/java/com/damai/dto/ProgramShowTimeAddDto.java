package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目演出时间添加 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="ProgramShowTimeAddDto", description ="节目演出时间添加")
public class ProgramShowTimeAddDto {
    
    @Schema(name ="programId", type ="Long", description ="节目表id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long programId;
    
    @Schema(name ="showTime", type ="Date", description ="演出时间",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Date showTime;
    
    @Schema(name ="showDayTime", type ="Date", description ="演出时间(精确到天)",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Date showDayTime;
    
    @Schema(name ="showWeekTime", type ="String", description ="演出时间所在的星期",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String showWeekTime;
}
