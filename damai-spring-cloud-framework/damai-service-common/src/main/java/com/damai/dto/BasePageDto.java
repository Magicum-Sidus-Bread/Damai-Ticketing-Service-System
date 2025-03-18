package com.damai.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分页dto
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class BasePageDto {
    
    
    @NotNull
    private Integer pageNumber;
    
    
    @NotNull
    private Integer pageSize;
}
