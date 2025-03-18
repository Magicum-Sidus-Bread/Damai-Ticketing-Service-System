package com.damai.conf;

import com.damai.common.ApiResponse;
import lombok.Data;

import java.util.Map;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 临时信息
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class RequestTemporaryWrapper {
    
    private Map<String,String> map;
    
    private ApiResponse<?> apiResponse;
}
