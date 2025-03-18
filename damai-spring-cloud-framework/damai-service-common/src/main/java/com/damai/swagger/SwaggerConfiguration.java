package com.damai.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: swagger配置
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Configuration
public class SwaggerConfiguration {
    
    @Bean
    public OpenAPI customOpenApi() {
        
        return new OpenAPI()
                .info(new Info()
                        .title("前端使用")
                        .version("1.0")
                        .description("项目学习")
                        .contact(new Contact()
                                .name(" MagicumSidus")
                        ));
        
    }
}

