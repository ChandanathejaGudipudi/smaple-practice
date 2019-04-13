package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Process_Details")
public class ProcessDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Process_Code")
	private String processCode;
	@Column (name="Process_Name")
	private String processName;
	private String sub_Sector_Code;
	private String ubs_Segment_Code;
	private String ubs_Service_Line_Code;
	private String sector_Code;
	private String department_Code;
	private String client_Code;
	private String active_Status;
	private int updated_By;
	private String updated_Date;
	
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
	 * @return the ubs_Segment_Code
	 */
	public String getUbs_Segment_Code() {
		return ubs_Segment_Code;
	}
	/**
	 * @param ubs_Segment_Code the ubs_Segment_Code to set
	 */
	public void setUbs_Segment_Code(String ubs_Segment_Code) {
		this.ubs_Segment_Code = ubs_Segment_Code;
	}
	/**
	 * @return the ubs_Service_Line_Code
	 */
	public String getUbs_Service_Line_Code() {
		return ubs_Service_Line_Code;
	}
	/**
	 * @param ubs_Service_Line_Code the ubs_Service_Line_Code to set
	 */
	public void setUbs_Service_Line_Code(String ubs_Service_Line_Code) {
		this.ubs_Service_Line_Code = ubs_Service_Line_Code;
	}
	/**
	 * @return the sector_Code
	 */
	public String getSector_Code() {
		return sector_Code;
	}
	/**
	 * @param sector_Code the sector_Code to set
	 */
	public void setSector_Code(String sector_Code) {
		this.sector_Code = sector_Code;
	}
	/**
	 * @return the department_Code
	 */
	public String getDepartment_Code() {
		return department_Code;
	}
	/**
	 * @param department_Code the department_Code to set
	 */
	public void setDepartment_Code(String department_Code) {
		this.department_Code = department_Code;
	}
	/**
	 * @return the client_Code
	 */
	public String getClient_Code() {
		return client_Code;
	}
	/**
	 * @param client_Code the client_Code to set
	 */
	public void setClient_Code(String client_Code) {
		this.client_Code = client_Code;
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
