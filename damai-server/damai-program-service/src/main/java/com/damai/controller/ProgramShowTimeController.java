package com.damai.controller;

import com.damai.common.ApiResponse;
import com.damai.dto.ProgramShowTimeAddDto;
import com.damai.service.ProgramShowTimeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目演出时间 控制层
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@RestController
@RequestMapping("/program/show/time")
@Tag(name = "program-show-time", description = "节目演出时间")
public class ProgramShowTimeController {
    
    @Autowired
    private ProgramShowTimeService programShowTimeService;
    
    @Operation(summary  = "添加")
    @PostMapping(value = "/add")
    public ApiResponse<Long> add(@Valid @RequestBody ProgramShowTimeAddDto programShowTimeAddDto) {
        return ApiResponse.ok(programShowTimeService.add(programShowTimeAddDto));
    }
}
