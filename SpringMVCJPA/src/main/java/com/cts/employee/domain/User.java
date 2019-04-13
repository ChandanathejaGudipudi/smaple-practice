package com.cts.employee.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class User {
	private Integer ctsId;
	private String fullName;
	
	/**
	 * @return the ctsId
	 */
	public Integer getCtsId() {
		return ctsId;
	}
	/**
	 * @param ctsId the ctsId to set
	 */
	public void setCtsId(Integer ctsId) {
		this.ctsId = ctsId;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
