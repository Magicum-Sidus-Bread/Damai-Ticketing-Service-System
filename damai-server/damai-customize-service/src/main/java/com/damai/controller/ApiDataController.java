package com.damai.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.damai.common.ApiResponse;
import com.damai.dto.ApiDataDto;
import com.damai.service.ApiDataService;
import com.damai.vo.ApiDataVo;
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
 * @description: api调用记录 控制层
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@RestController
@RequestMapping("/apiData")
@Tag(name = "apiData", description = "api调用记录")
public class ApiDataController {
    
    @Autowired
    private ApiDataService apiDataService;
    
    @Operation(summary  = "分页查询api调用记录")
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse<Page<ApiDataVo>> pageList(@Valid @RequestBody ApiDataDto dto) {
        return ApiResponse.ok(apiDataService.pageList(dto));
    }
}
