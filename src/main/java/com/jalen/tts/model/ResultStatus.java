package com.jalen.tts.model;

/**
 * @author jalen
 * @description ����״̬��
 */
public enum ResultStatus {
	SUCCESS(100, "�ɹ�"),
	USERNAME_OR_PASSWORD_ERROR(-1001, "�û������������"),
	USER_NOT_FOUND(-1002, "�û�������"),
	USER_NOT_LOGIN(-1003, "�û�δ��½"),
	DATA_NOT_NULL(-1004, "�ֶβ���Ϊ��"),
	USERNAME_HAS_EXISTS(-1005, "�û��Ѵ���");
	
	/**
	 * ������
	 */
	private int code;
	
	/**
	 * ���ؽ������
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
