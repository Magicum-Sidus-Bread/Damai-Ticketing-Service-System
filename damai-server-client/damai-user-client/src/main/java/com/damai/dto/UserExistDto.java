package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 手机手机号 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="UserExistDto", description ="用户是否存在")
public class UserExistDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Schema(name ="mobile", type ="String", description ="手机号",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String mobile;
    
}
