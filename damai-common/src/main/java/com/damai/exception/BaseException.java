package com.damai.exception;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 基础异常
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class BaseException extends RuntimeException{
	
	public BaseException() {
		
	}
	
	public BaseException(String message) {
		super(message);
	}
	
	public BaseException(Throwable cause) {
		super(cause);
	}
	
	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Integer code, String message, Throwable cause) {
		super(message, cause);
	}
}
