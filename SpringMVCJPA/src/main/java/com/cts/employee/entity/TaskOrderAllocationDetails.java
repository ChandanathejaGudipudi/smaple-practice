package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_TaskOrder_Project_Allocation_Details")
public class TaskOrderAllocationDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
	@Column (name="TaskOrder_Allocation_Id")
	private Integer taskOrderAllocationId;
	@Column (name="S2C_Number")
	private String s2cNumber;
	@Column (name="Project_Id")
	private Integer projectId;
	private String project_Name;
	private String process;
	/**
	 * @return the taskOrderAllocationId
	 */
	public Integer getTaskOrderAllocationId() {
		return taskOrderAllocationId;
	}
	/**
	 * @param taskOrderAllocationId the taskOrderAllocationId to set
	 */
	public void setTaskOrderAllocationId(Integer taskOrderAllocationId) {
		this.taskOrderAllocationId = taskOrderAllocationId;
	}
	/**
	 * @return the s2cNumber
	 */
	public String getS2cNumber() {
		return s2cNumber;
	}
	/**
	 * @param s2cNumber the s2cNumber to set
	 */
	public void setS2cNumber(String s2cNumber) {
		this.s2cNumber = s2cNumber;
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
	
	
}
