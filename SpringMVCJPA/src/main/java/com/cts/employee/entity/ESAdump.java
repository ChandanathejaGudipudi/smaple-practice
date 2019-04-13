package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_ESA_Dump")
public class ESAdump {
	
	@Id
    @Basic(optional = false)
	@Column (name="Asso_ID")
	private Integer associateCTSId;
	@Column (name="Asso_Name")
	private String associateName;
	@Column (name="Proj_ID")
	private Integer projectId;
	private String project_name;
	private String location;
	private String start_Date;
	private String end_Date;
	private String asso_Onsite_Offshore;
	private Integer alloc_Percent;
	private Integer manager_ID;
	private String manager_Name;
	private String asso_Supervisor_id;
	private String supervisor_Name;
	private String asso_Mail_ID;
	private String cust_Name;
	private Integer cust_id;
	private String billabilityStatus;
	private String assignment_Status;
	private String proj_Start_Date;
	private String proj_End_Date;
	private String proj_Confirmation_Type;
	private String proj_Status;
	private String region_Name;
	
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
	 * @return the associateName
	 */
	public String getAssociateName() {
		return associateName;
	}
	/**
	 * @param associateName the associateName to set
	 */
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
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
	 * @return the project_name
	 */
	public String getProject_name() {
		return project_name;
	}
	/**
	 * @param project_name the project_name to set
	 */
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the start_Date
	 */
	public String getStart_Date() {
		return start_Date;
	}
	/**
	 * @param start_Date the start_Date to set
	 */
	public void setStart_Date(String start_Date) {
		this.start_Date = start_Date;
	}
	/**
	 * @return the end_Date
	 */
	public String getEnd_Date() {
		return end_Date;
	}
	/**
	 * @param end_Date the end_Date to set
	 */
	public void setEnd_Date(String end_Date) {
		this.end_Date = end_Date;
	}
	/**
	 * @return the asso_Onsite_Offshore
	 */
	public String getAsso_Onsite_Offshore() {
		return asso_Onsite_Offshore;
	}
	/**
	 * @param asso_Onsite_Offshore the asso_Onsite_Offshore to set
	 */
	public void setAsso_Onsite_Offshore(String asso_Onsite_Offshore) {
		this.asso_Onsite_Offshore = asso_Onsite_Offshore;
	}
	/**
	 * @return the alloc_Percent
	 */
	public Integer getAlloc_Percent() {
		return alloc_Percent;
	}
	/**
	 * @param alloc_Percent the alloc_Percent to set
	 */
	public void setAlloc_Percent(Integer alloc_Percent) {
		this.alloc_Percent = alloc_Percent;
	}
	/**
	 * @return the manager_ID
	 */
	public Integer getManager_ID() {
		return manager_ID;
	}
	/**
	 * @param manager_ID the manager_ID to set
	 */
	public void setManager_ID(Integer manager_ID) {
		this.manager_ID = manager_ID;
	}
	/**
	 * @return the manager_Name
	 */
	public String getManager_Name() {
		return manager_Name;
	}
	/**
	 * @param manager_Name the manager_Name to set
	 */
	public void setManager_Name(String manager_Name) {
		this.manager_Name = manager_Name;
	}
	/**
	 * @return the asso_Supervisor_id
	 */
	public String getAsso_Supervisor_id() {
		return asso_Supervisor_id;
	}
	/**
	 * @param asso_Supervisor_id the asso_Supervisor_id to set
	 */
	public void setAsso_Supervisor_id(String asso_Supervisor_id) {
		this.asso_Supervisor_id = asso_Supervisor_id;
	}
	/**
	 * @return the supervisor_Name
	 */
	public String getSupervisor_Name() {
		return supervisor_Name;
	}
	/**
	 * @param supervisor_Name the supervisor_Name to set
	 */
	public void setSupervisor_Name(String supervisor_Name) {
		this.supervisor_Name = supervisor_Name;
	}
	/**
	 * @return the asso_Mail_ID
	 */
	public String getAsso_Mail_ID() {
		return asso_Mail_ID;
	}
	/**
	 * @param asso_Mail_ID the asso_Mail_ID to set
	 */
	public void setAsso_Mail_ID(String asso_Mail_ID) {
		this.asso_Mail_ID = asso_Mail_ID;
	}
	/**
	 * @return the cust_Name
	 */
	public String getCust_Name() {
		return cust_Name;
	}
	/**
	 * @param cust_Name the cust_Name to set
	 */
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	/**
	 * @return the cust_id
	 */
	public Integer getCust_id() {
		return cust_id;
	}
	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	/**
	 * @return the billabilityStatus
	 */
	public String getBillabilityStatus() {
		return billabilityStatus;
	}
	/**
	 * @param billabilityStatus the billabilityStatus to set
	 */
	public void setBillabilityStatus(String billabilityStatus) {
		this.billabilityStatus = billabilityStatus;
	}
	/**
	 * @return the assignment_Status
	 */
	public String getAssignment_Status() {
		return assignment_Status;
	}
	/**
	 * @param assignment_Status the assignment_Status to set
	 */
	public void setAssignment_Status(String assignment_Status) {
		this.assignment_Status = assignment_Status;
	}
	/**
	 * @return the proj_Start_Date
	 */
	public String getProj_Start_Date() {
		return proj_Start_Date;
	}
	/**
	 * @param proj_Start_Date the proj_Start_Date to set
	 */
	public void setProj_Start_Date(String proj_Start_Date) {
		this.proj_Start_Date = proj_Start_Date;
	}
	/**
	 * @return the proj_End_Date
	 */
	public String getProj_End_Date() {
		return proj_End_Date;
	}
	/**
	 * @param proj_End_Date the proj_End_Date to set
	 */
	public void setProj_End_Date(String proj_End_Date) {
		this.proj_End_Date = proj_End_Date;
	}
	/**
	 * @return the proj_Confirmation_Type
	 */
	public String getProj_Confirmation_Type() {
		return proj_Confirmation_Type;
	}
	/**
	 * @param proj_Confirmation_Type the proj_Confirmation_Type to set
	 */
	public void setProj_Confirmation_Type(String proj_Confirmation_Type) {
		this.proj_Confirmation_Type = proj_Confirmation_Type;
	}
	/**
	 * @return the proj_Status
	 */
	public String getProj_Status() {
		return proj_Status;
	}
	/**
	 * @param proj_Status the proj_Status to set
	 */
	public void setProj_Status(String proj_Status) {
		this.proj_Status = proj_Status;
	}
	/**
	 * @return the region_Name
	 */
	public String getRegion_Name() {
		return region_Name;
	}
	/**
	 * @param region_Name the region_Name to set
	 */
	public void setRegion_Name(String region_Name) {
		this.region_Name = region_Name;
	}
	/**
	 * @return the updated_By
	 */
	
	
	
	
}
