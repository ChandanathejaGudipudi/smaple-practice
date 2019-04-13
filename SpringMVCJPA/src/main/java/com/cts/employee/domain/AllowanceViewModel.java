package com.cts.employee.domain;

public class AllowanceViewModel {

	private String duplicateMessage;
	private String mismatchMessage;
	private String invalidMessage;
	private String allowance;
	private String operation;
	private String message;
	private String uploadFailed;
	public String getDuplicateMessage() {
		return duplicateMessage;
	}
	public void setDuplicateMessage(String duplicateMessage) {
		this.duplicateMessage = duplicateMessage;
	}
	public String getMismatchMessage() {
		return mismatchMessage;
	}
	public void setMismatchMessage(String mismatchMessage) {
		this.mismatchMessage = mismatchMessage;
	}
	public String getInvalidMessage() {
		return invalidMessage;
	}
	public void setInvalidMessage(String invalidMessage) {
		this.invalidMessage = invalidMessage;
	}
	public String getAllowance() {
		return allowance;
	}
	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUploadFailed() {
		return uploadFailed;
	}
	public void setUploadFailed(String uploadFailed) {
		this.uploadFailed = uploadFailed;
	}
	
	/**
	 * Clear content
	 */
	public void reset(){	
		duplicateMessage = "";
		mismatchMessage = "";
		invalidMessage = "";
		message = "";
		uploadFailed = "";
	}
}
