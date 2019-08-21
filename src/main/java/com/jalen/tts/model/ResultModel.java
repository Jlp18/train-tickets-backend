package com.jalen.tts.model;

/**
 * 
 * @author jalen
 * @description �Զ��巵�ؽ��
 *
 */
public class ResultModel {
	/**
	 * ������
	 */
	private int code;
	
	/**
	 * ���ؽ������
	 */
	private String message;
	
	/**
	 * ��������
	 */
	private Object data;
	
	public ResultModel(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public ResultModel(int code, String message) {
		this.code = code;
		this.message = message;
		this.data = "";
	}
	
	public ResultModel(ResultStatus status) {
		this.code = status.getCode();
		this.message = status.getMessage();
		this.data = "";
	}
	
	public ResultModel(ResultStatus status, Object data) {
		this.code = status.getCode();
		this.message = status.getMessage();
		this.data = data;
	}
	/**
	 * @return����ɹ�
	 */
	public static ResultModel ok() {
		return new ResultModel(ResultStatus.SUCCESS);
	}
	
	public static ResultModel ok(Object data) {
		return new ResultModel(ResultStatus.SUCCESS, data);
	}
	/**
	 * @return����ʧ��
	 */
	public static ResultModel error(ResultStatus error) {
		return new ResultModel(error);
	}
	
	public int getCode() {
		return this.code;
	}
	public String getMessage() {
		return this.message;
	}
	public Object getData() {
		return this.data;
	}
}
