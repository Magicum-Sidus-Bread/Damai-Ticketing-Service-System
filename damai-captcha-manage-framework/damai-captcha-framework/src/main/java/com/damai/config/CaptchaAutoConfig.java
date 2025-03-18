package com.damai.config;

import com.damai.properties.AjCaptchaProperties;
import com.damai.captcha.service.CaptchaCacheService;
import com.damai.captcha.service.CaptchaService;
import com.damai.captcha.service.impl.CaptchaServiceFactory;
import com.damai.service.CaptchaCacheServiceRedisImpl;
import com.damai.service.CaptchaHandle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 验证码配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class CaptchaAutoConfig {
    
    @Bean
    public CaptchaHandle captchaHandle(CaptchaService captchaService){
        return new CaptchaHandle(captchaService);
    }
    
    @Bean(name = "AjCaptchaCacheService")
    @Primary
    public CaptchaCacheService captchaCacheService(AjCaptchaProperties config, StringRedisTemplate redisTemplate){
        //缓存类型redis/local/....
        CaptchaCacheService ret = CaptchaServiceFactory.getCache(config.getCacheType().name());
        if(ret instanceof CaptchaCacheServiceRedisImpl){
            ((CaptchaCacheServiceRedisImpl)ret).setStringRedisTemplate(redisTemplate);
        }
        return ret;
    }
}
