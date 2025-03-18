package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用户密码更新 dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="UserUpdatePasswordDto", description ="修改用户密码")
public class UserUpdatePasswordDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Schema(name ="id", type ="Long", description ="用户id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
    
    @Schema(name ="password", type ="String", description ="密码",requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String password;
    
}
