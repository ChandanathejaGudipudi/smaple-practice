package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Associate_Project_Allocation_Details")
public class AssociateAllocationDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
	@Column (name="Associate_Allocation_Id")
	private Integer associateAllocationId;
	@Column (name="Associate_CTS_Id")
	private Integer associateCTSId;
	@Column (name="Project_Id")
	private Integer projectId;
	private String project_Name;
	private String process;
	private String allocation_Effective_Date;
	private String allocation_Status;
	private Float allocation_Percentage;
	private Integer updated_By;
	private String updated_Date;
	@Column (name="GPIN")
	private Integer gpin;
	@Column (name="Full_Name")
	private String fullName;
	
	/**
	 * @return the associateAllocationId
	 */
	public Integer getAssociateAllocationId() {
		return associateAllocationId;
	}
	/**
	 * @param associateAllocationId the associateAllocationId to set
	 */
	public void setAssociateAllocationId(Integer associateAllocationId) {
		this.associateAllocationId = associateAllocationId;
	}
	/**
	 * @return the associateCTSId
	 */
	public Integer getAssociateCTSId() {
		return associateCTSId;
	}
	/**
	 * @param associateCTSId the associateCTSId to set
	 */
	public void setAssociateCTSId(Integer associateCTSId) {
		this.associateCTSId = associateCTSId;
	}
	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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
	 * @return the allocation_Effective_Date
	 */
	public String getAllocation_Effective_Date() {
		return allocation_Effective_Date;
	}
	/**
	 * @param allocation_Effective_Date the allocation_Effective_Date to set
	 */
	public void setAllocation_Effective_Date(String allocation_Effective_Date) {
		this.allocation_Effective_Date = allocation_Effective_Date;
	}
	/**
	 * @return the allocation_Status
	 */
	public String getAllocation_Status() {
		return allocation_Status;
	}
	/**
	 * @param allocation_Status the allocation_Status to set
	 */
	public void setAllocation_Status(String allocation_Status) {
		this.allocation_Status = allocation_Status;
	}
	/**
	 * @return the allocation_Percentage
	 */
	public Float getAllocation_Percentage() {
		return allocation_Percentage;
	}
	/**
	 * @param allocation_Percentage the allocation_Percentage to set
	 */
	public void setAllocation_Percentage(Float allocation_Percentage) {
		this.allocation_Percentage = allocation_Percentage;
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
	 * @return the gpin
	 */
	public Integer getGpin() {
		return gpin;
	}
	/**
	 * @param gpin the gpin to set
	 */
	public void setGpin(Integer gpin) {
		this.gpin = gpin;
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
