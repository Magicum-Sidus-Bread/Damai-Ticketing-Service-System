package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 地区列表查询 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="AreaSelectDto", description ="AreaSelectDto")
public class AreaSelectDto {
    
    @Schema(name ="idList", type ="List<Long>",description = "id集合",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private List<Long> idList;
}
