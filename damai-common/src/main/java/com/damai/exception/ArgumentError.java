package com.damai.exception;

import lombok.Data;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 参数错误
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class ArgumentError {
	
	private String argumentName;
	
	private String message;
}
