package com.damai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: elasticsearch文档映射
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsDocumentMappingDto {
    
    /**
     * 字段名
     * */
    private String paramName;
    
    /**
     * 字段类型
     * */
    private String paramType;
}
