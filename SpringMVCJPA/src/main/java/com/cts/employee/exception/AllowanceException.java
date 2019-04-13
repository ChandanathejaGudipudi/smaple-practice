package com.cts.employee.exception;

public class AllowanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4203501236673986615L;

	public AllowanceException(String error) {
		super(error);
	}

	public AllowanceException(String error, Exception e) {
		super(error,e);
	}
}
