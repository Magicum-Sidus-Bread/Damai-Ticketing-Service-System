package com.damai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.damai.data.BaseTableData;
import lombok.Data;

import java.io.Serializable;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 渠道 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@TableName("d_channel_data")
public class ChannelTableData extends BaseTableData implements Serializable {
    /**
     * id
     * */
    private Long id;
    
    /**
     * 名称
     * */
    private String name;
    
    /**
     * 编码
     * */
    private String code;
    
    /**
     * 介绍描述
     * */
    private String introduce;
    
    /**
     * rsa签名公钥
     * */
    private String signPublicKey;
    
    /**
     * rsa签名秘钥
     * */
    private String signSecretKey;
    
    /**
     * aes秘钥
     * */
    private String aesKey;
    
    /**
     * rsa参数公钥
     * */
    private String dataPublicKey;
    
    /**
     * rsa参数私钥
     * */
    private String dataSecretKey;
    
    /**
     * token秘钥
     * */
    private String tokenSecret;
    
}