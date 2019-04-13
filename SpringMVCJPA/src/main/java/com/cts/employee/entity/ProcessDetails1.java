package com.cts.employee.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Process_Details")
public class ProcessDetails1 {
	
	@Id
    @Basic(optional = false)
	@Column (name="Process_Code")
	private String processCode;
	@Column (name="Process_Name")
	private String processName;
	private String sub_Sector_Code;
	private String active_Status;
	private int updated_By;
	private Date updated_Date;
	
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
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}
	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * @return the sub_Sector_Code
	 */
	public String getSub_Sector_Code() {
		return sub_Sector_Code;
	}
	/**
	 * @param sub_Sector_Code the sub_Sector_Code to set
	 */
	public void setSub_Sector_Code(String sub_Sector_Code) {
		this.sub_Sector_Code = sub_Sector_Code;
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
	public Date getUpdated_Date() {
		return updated_Date;
	}
	/**
	 * @param updated_Date the updated_Date to set
	 */
	public void setUpdated_Date(Date updated_Date) {
		this.updated_Date = updated_Date;
	}
}
