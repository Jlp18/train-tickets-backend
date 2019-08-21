package com.jalen.tts.model;

/**
 * @author jalen
 * @description 返回状态码
 */
public enum ResultStatus {
	SUCCESS(100, "成功"),
	USERNAME_OR_PASSWORD_ERROR(-1001, "用户名或密码错误"),
	USER_NOT_FOUND(-1002, "用户不存在"),
	USER_NOT_LOGIN(-1003, "用户未登陆"),
	DATA_NOT_NULL(-1004, "字段不能为空"),
	USERNAME_HAS_EXISTS(-1005, "用户已存在");
	
	/**
	 * 返回码
	 */
	private int code;
	
	/**
	 * 返回结果描述
	 */
	private String message;
	
	ResultStatus(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
