package com.damai.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: elasticsearch配置属性
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@ConfigurationProperties(prefix = BusinessEsProperties.PREFIX)
public class BusinessEsProperties {
    
    public static final String PREFIX = "elasticsearch";
    
    private String[] ip;
    
    private String userName;
    
    private String passWord;
    
    private Boolean esSwitch = true;
    
    private Boolean esTypeSwitch = false;
    
    private Integer connectTimeOut = 40000;
    
    private Integer socketTimeOut = 40000;
    
    private Integer connectionRequestTimeOut = 40000;
    
    private Integer maxConnectNum = 400;
}
