package com.cts.employee.domain;

public class Allocation {

	private Integer associateCTSId;
	private Integer projectId;
	private String projectName;;
	private String allocation_Status;
	private Float allocation_Percentage;
	private int updated_By;
	private String updated_Date;
	private boolean checked;
	private String processId;
	private String processName;
	
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}
	/**
	 * @param checked the checked to set
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
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
	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}
	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
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
	
	
}
