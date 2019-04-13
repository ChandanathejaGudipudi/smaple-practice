package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_project_managers_details")
public class ProjectManagersDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Project_Manager_Code")
	private String projectManagerCode;
	@Column (name="Project_Manager_CTS_Id")
	private int projectManagerCTSId;
	private int project_Manager_GPIN;
	private String project_Manager_Name;
	private String effective_Date;
	private String updated_Date;
	private int updated_By;
	
	/**
	 * @return the projectManagerCode
	 */
	public String getProjectManagerCode() {
		return projectManagerCode;
	}
	/**
	 * @param projectManagerCode the projectManagerCode to set
	 */
	public void setProjectManagerCode(String projectManagerCode) {
		this.projectManagerCode = projectManagerCode;
	}
	/**
	 * @return the projectManagerCTSId
	 */
	public int getProjectManagerCTSId() {
		return projectManagerCTSId;
	}
	/**
	 * @param project_Manager_CTS_Id the projectManagerCTSId to set
	 */
	public void setProjectManagerCTSId(int projectManagerCTSId) {
		this.projectManagerCTSId = projectManagerCTSId;
	}
	/**
	 * @return the project_Manager_GPIN
	 */
	public int getProject_Manager_GPIN() {
		return project_Manager_GPIN;
	}
	/**
	 * @param project_Manager_GPIN the project_Manager_GPIN to set
	 */
	public void setProject_Manager_GPIN(int project_Manager_GPIN) {
		this.project_Manager_GPIN = project_Manager_GPIN;
	}
	/**
	 * @return the project_Manager_Name
	 */
	public String getProject_Manager_Name() {
		return project_Manager_Name;
	}
	/**
	 * @param project_Manager_Name the project_Manager_Name to set
	 */
	public void setProject_Manager_Name(String project_Manager_Name) {
		this.project_Manager_Name = project_Manager_Name;
	}/*
	*//**
	 * @return the effective_Date
	 *//*
	public Date getEffective_Date() {
		return effective_Date;
	}
	*//**
	 * @param effective_Date the effective_Date to set
	 *//*
	public void setEffective_Date(Date effective_Date) {
		this.effective_Date = effective_Date;
	}*/
	/*
	*//**
	 * @return the updated_Date
	 *//*
	public Date getUpdated_Date() {
		return updated_Date;
	}
	*//**
	 * @param updated_Date the updated_Date to set
	 *//*
	public void setUpdated_Date(Date updated_Date) {
		this.updated_Date = updated_Date;
	}*/
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
