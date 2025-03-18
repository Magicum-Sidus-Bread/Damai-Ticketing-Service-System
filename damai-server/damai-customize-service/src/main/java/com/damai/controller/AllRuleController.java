package com.damai.controller;

import com.damai.common.ApiResponse;
import com.damai.dto.AllRuleDto;
import com.damai.service.AllRuleService;
import com.damai.vo.AllDepthRuleVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 所有规则 控制层
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@RestController
@RequestMapping("/allRule")
@Tag(name = "allRule", description = "所有规则")
public class AllRuleController {

    @Autowired
    private AllRuleService allRuleService;
    
    
    @Operation(summary  = "添加所有规则")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ApiResponse<Void> add(@Valid @RequestBody AllRuleDto allRuleDto) {
        allRuleService.add(allRuleDto);
        return ApiResponse.ok();
    }
    
    @Operation(summary  = "查询所有规则")
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ApiResponse<AllDepthRuleVo> get() {
        return ApiResponse.ok(allRuleService.get());
    }
}
