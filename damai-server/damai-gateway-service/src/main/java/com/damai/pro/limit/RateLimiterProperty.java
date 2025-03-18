package com.damai.pro.limit;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 线上限流工具属性
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class RateLimiterProperty {
    
    @Value("${rate.switch:false}")
    private Boolean rateSwitch;

    @Value("${rate.permits:200}")
    private Integer ratePermits;
}
