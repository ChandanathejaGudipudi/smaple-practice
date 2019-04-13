package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Users")
public class Users {
	
	@Id
    @Basic(optional = false)
	@Column (name="User_Code")
	private String userCode;
	@Column (name="Associate_CTS_Id")
	private Integer ctsId;
	private String Role;
	@Column (name="Active_Status")
	private String status;
	private Integer updated_By;
	private String updated_Date;
	@Column (name="password")
	private String pwd;
	
	

	
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
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
	 * @return the role
	 */
	public String getRole() {
		return Role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		Role = role;
	}
	/**
	 * @return the active_Status
	 */
	
	/**
	 * @return the updated_By
	 */
	public Integer getUpdated_By() {
		return updated_By;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(Integer updated_By) {
		this.updated_By = updated_By;
	}
	/**
	 * @return the updated_Date
	 */
	public String getUpdated_Date() {
		return updated_Date;
	}
	/**
	 * @param updated_Date the updated_Date to set
	 */
	public void setUpdated_Date(String updated_Date) {
		this.updated_Date = updated_Date;
	}
	
}
