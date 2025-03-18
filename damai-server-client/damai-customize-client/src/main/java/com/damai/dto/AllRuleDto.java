package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 所有规则 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="AllRuleDto", description ="全部规则")
public class AllRuleDto {
    
    @Schema(name ="ruleDto", type ="RuleDto", description ="普通规则", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private RuleDto ruleDto;
    
    @Schema(name ="depthRuleDtoList", type ="DepthRuleDto[]", description ="深度规则")
    private List<DepthRuleDto> depthRuleDtoList;
}
