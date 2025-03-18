package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 渠道数据添加 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="ChannelDataAddDto", description ="渠道数据")
public class ChannelDataAddDto {
    
    @Schema(name ="name", type ="String", description ="名称",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String name;
    
    @Schema(name ="code", type ="String", description ="code码", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String code;
    
    @Schema(name ="introduce", type ="String", description ="介绍", requiredMode= RequiredMode.REQUIRED)
    private String introduce;
    
    @Schema(name ="signPublicKey", type ="String", description ="rsa签名公钥", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String signPublicKey;
    
    @Schema(name ="signSecretKey", type ="String", description ="rsa签名私钥", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String signSecretKey;
    
    @Schema(name ="aesKey", type ="String", description ="aes私钥")
    private String aesKey;
    
    @Schema(name ="dataPublicKey", type ="String", description ="rsa参数公钥")
    private String dataPublicKey;
    
    @Schema(name ="dataSecretKey", type ="String", description ="rsa参数私钥")
    private String dataSecretKey;
    
    @Schema(name ="tokenSecret", type ="String", description ="token秘钥", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String tokenSecret;;
    
}
