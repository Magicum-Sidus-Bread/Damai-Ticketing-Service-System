package com.damai.service.tool;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: token失效时间管理
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Component
public class TokenExpireManager {
    
    @Value("${token.expire.time:40}")
    private Long tokenExpireTime;
}
