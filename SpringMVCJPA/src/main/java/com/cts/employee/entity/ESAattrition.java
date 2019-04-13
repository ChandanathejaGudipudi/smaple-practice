package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_ESA_Attrition")
public class ESAattrition {
	
	@Id
    @Basic(optional = false)
	@Column (name="Asso_ID")
	private Integer associateCTSId;
	@Column (name="Asso_Name")
	private String associateName;
	@Column (name="Last_Project_ID")
	private Integer projectId;
	private String last_Project_Name;
	private String location;
	private Integer manager_ID;
	private String manager_Name;
	private String supv_ID;
	private String supv_Name;
	private String reasonforAttrition;
	private String lWD;
	
	
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
	 * @return the last_Project_Name
	 */
	public String getLast_Project_Name() {
		return last_Project_Name;
	}
	/**
	 * @param last_Project_Name the last_Project_Name to set
	 */
	public void setLast_Project_Name(String last_Project_Name) {
		this.last_Project_Name = last_Project_Name;
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
	 * @return the supv_ID
	 */
	public String getSupv_ID() {
		return supv_ID;
	}
	/**
	 * @param supv_ID the supv_ID to set
	 */
	public void setSupv_ID(String supv_ID) {
		this.supv_ID = supv_ID;
	}
	/**
	 * @return the supv_Name
	 */
	public String getSupv_Name() {
		return supv_Name;
	}
	/**
	 * @param supv_Name the supv_Name to set
	 */
	public void setSupv_Name(String supv_Name) {
		this.supv_Name = supv_Name;
	}
	/**
	 * @return the reasonforAttrition
	 */
	public String getReasonforAttrition() {
		return reasonforAttrition;
	}
	/**
	 * @param reasonforAttrition the reasonforAttrition to set
	 */
	public void setReasonforAttrition(String reasonforAttrition) {
		this.reasonforAttrition = reasonforAttrition;
	}
	/**
	 * @return the lWD
	 */
	public String getlWD() {
		return lWD;
	}
	/**
	 * @param lWD the lWD to set
	 */
	public void setlWD(String lWD) {
		this.lWD = lWD;
	}
	
	
	
	
	
	
}
