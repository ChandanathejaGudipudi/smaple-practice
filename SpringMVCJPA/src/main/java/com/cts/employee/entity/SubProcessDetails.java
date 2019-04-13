package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Sub_Process_Details")
public class SubProcessDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Sub_Process_Code")
	private String subProcessCode;
	@Column (name="Sub_Process_Name")
	private String subProcessName;
	@Column (name="Process_Code")
	private String processCode;
	private String active_Status;
	private int updated_By;
	private String updated_Date;
	
	/**
	 * @return the subProcessCode
	 */
	public String getSubProcessCode() {
		return subProcessCode;
	}
	/**
	 * @param subProcessCode the subProcessCode to set
	 */
	public void setSubProcessCode(String subProcessCode) {
		this.subProcessCode = subProcessCode;
	}
	/**
	 * @return the subProcessName
	 */
	public String getSubProcessName() {
		return subProcessName;
	}
	/**
	 * @param subProcessName the subProcessName to set
	 */
	public void setSubProcessName(String subProcessName) {
		this.subProcessName = subProcessName;
	}
	/**
	 * @return the processCode
	 */
	public String getProcessCode() {
		return processCode;
	}
	/**
	 * @param processCode the processCode to set
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	/**
	 * @return the active_Status
	 */
	public String getActive_Status() {
		return active_Status;
	}
	/**
	 * @param active_Status the active_Status to set
	 */
	public void setActive_Status(String active_Status) {
		this.active_Status = active_Status;
	}
	/**
	 * @return the updated_By
	 */
	public int getUpdated_By() {
		return updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(int updated_By) {
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
