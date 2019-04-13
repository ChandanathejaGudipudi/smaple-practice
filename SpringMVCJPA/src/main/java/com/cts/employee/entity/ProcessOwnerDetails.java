package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Process_Owner_Details")
public class ProcessOwnerDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Process_Owner_Code")
	private String processOwnerCode;
	private String processCode;
	@Column (name="Process_Owner_CTS_Id")
	private Integer processOwnerCTSId;
	private Integer process_Owner_GPIN;
	private String process_Owner_Name;
	private String effective_Date;
	private String updated_Date;
	private Integer updated_By;
	
	/**
	 * @return the processOwnerCode
	 */
	public String getProcessOwnerCode() {
		return processOwnerCode;
	}
	/**
	 * @param processOwnerCode the processOwnerCode to set
	 */
	public void setProcessOwnerCode(String processOwnerCode) {
		this.processOwnerCode = processOwnerCode;
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
	 * @return the processOwnerCTSId
	 */
	public Integer getProcessOwnerCTSId() {
		return processOwnerCTSId;
	}
	/**
	 * @param processOwnerCTSId the processOwnerCTSId to set
	 */
	public void setProcessOwnerCTSId(Integer processOwnerCTSId) {
		this.processOwnerCTSId = processOwnerCTSId;
	}
	/**
	 * @return the process_Owner_GPIN
	 */
	public Integer getProcess_Owner_GPIN() {
		return process_Owner_GPIN;
	}
	/**
	 * @param process_Owner_GPIN the process_Owner_GPIN to set
	 */
	public void setProcess_Owner_GPIN(Integer process_Owner_GPIN) {
		this.process_Owner_GPIN = process_Owner_GPIN;
	}
	/**
	 * @return the process_Owner_Name
	 */
	public String getProcess_Owner_Name() {
		return process_Owner_Name;
	}
	/**
	 * @param process_Owner_Name the process_Owner_Name to set
	 */
	public void setProcess_Owner_Name(String process_Owner_Name) {
		this.process_Owner_Name = process_Owner_Name;
	}
	/**
	 * @return the updated_By
	 */
	public Integer getUpdated_By() {
		return updated_By;
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
	/**
	 * @return the effective_Date
	 */
	public String getEffective_Date() {
		return effective_Date;
	}
	/**
	 * @param effective_Date the effective_Date to set
	 */
	public void setEffective_Date(String effective_Date) {
		this.effective_Date = effective_Date;
	}
	
	
}
