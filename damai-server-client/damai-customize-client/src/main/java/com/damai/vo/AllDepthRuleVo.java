package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 所有规则 vo
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="AllDepthRuleVo", description ="全部规则")
public class AllDepthRuleVo {
    
    @Schema(name ="ruleDto", type ="RuleDto", description ="普通规则")
    private RuleVo ruleVo;
    
    @Schema(name ="depthRuleDtoList", type ="DepthRuleDto[]", description ="深度规则")
    private List<DepthRuleVo> depthRuleVoList;
}
