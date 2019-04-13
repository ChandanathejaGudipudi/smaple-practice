package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Tbl_Associate_Attrition_Details")
public class AssociateAttritionDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Associate_Attrition_Id")
	private Integer attritionId;
	private Integer associate_CTS_Id;
	private String attrition_Type;
	private String reason;
	private String last_Working_Day;
	private String associate_Status;
	private String comments;
	private Integer project_Id;
	private String project_Name;
	private String process;
	private Integer updated_By;
	private String updated_Date;
	@Transient
	private AssociateSummary associate;
	
	/**
	 * @return the associate
	 */
	public AssociateSummary getAssociate() {
		return associate;
	}
	/**
	 * @param associate the associate to set
	 */
	public void setAssociate(AssociateSummary associate) {
		this.associate = associate;
	}
	
	/**
	 * @return the attritionId
	 */
	public Integer getAttritionId() {
		return attritionId;
	}
	/**
	 * @param attritionId the attritionId to set
	 */
	public void setAttritionId(Integer attritionId) {
		this.attritionId = attritionId;
	}
	/**
	 * @return the associate_CTS_Id
	 */
	public Integer getAssociate_CTS_Id() {
		return associate_CTS_Id;
	}
	/**
	 * @param associate_CTS_Id the associate_CTS_Id to set
	 */
	public void setAssociate_CTS_Id(Integer associate_CTS_Id) {
		this.associate_CTS_Id = associate_CTS_Id;
	}
	/**
	 * @return the associate_Status
	 */
	public String getAssociate_Status() {
		return associate_Status;
	}
	/**
	 * @param associate_Status the associate_Status to set
	 */
	public void setAssociate_Status(String associate_Status) {
		this.associate_Status = associate_Status;
	}
	/**
	 * @return the attrition_Type
	 */
	public String getAttrition_Type() {
		return attrition_Type;
	}
	/**
	 * @param attrition_Type the attrition_Type to set
	 */
	public void setAttrition_Type(String attrition_Type) {
		this.attrition_Type = attrition_Type;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the last_Working_Day
	 */
	public String getLast_Working_Day() {
		return last_Working_Day;
	}
	/**
	 * @param last_Working_Day the last_Working_Day to set
	 */
	public void setLast_Working_Day(String last_Working_Day) {
		this.last_Working_Day = last_Working_Day;
	}
	
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	/**
	 * @return the project_Id
	 */
	public Integer getProject_Id() {
		return project_Id;
	}
	/**
	 * @param project_Id the project_Id to set
	 */
	public void setProject_Id(Integer project_Id) {
		this.project_Id = project_Id;
	}
	/**
	 * @return the project_Name
	 */
	public String getProject_Name() {
		return project_Name;
	}
	/**
	 * @param project_Name the project_Name to set
	 */
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	/**
	 * @return the process
	 */
	public String getProcess() {
		return process;
	}
	/**
	 * @param process the process to set
	 */
	public void setProcess(String process) {
		this.process = process;
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
	
	
	
}
