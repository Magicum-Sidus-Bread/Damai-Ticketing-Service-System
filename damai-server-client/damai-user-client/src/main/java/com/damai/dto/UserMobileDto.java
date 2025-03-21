package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用户手机号 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="UserMobileDto", description ="用户手机号入参")
public class UserMobileDto {
    
    @Schema(name ="name", type ="String", description ="用户手机号", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String mobile;
}