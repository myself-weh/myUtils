package com.weh.common.utils;
/**
 * 
 * @ClassName: AssertException 
 * @Description: 断言异常类
 * @author: charles
 * @date: 2020年4月26日 上午10:45:47
 */
public class AssertException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public AssertException() {
		super();
	}
	public AssertException(String message) {
		
		super(message);
		this.message =message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
