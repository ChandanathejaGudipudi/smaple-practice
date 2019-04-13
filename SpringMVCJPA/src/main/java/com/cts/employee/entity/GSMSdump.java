package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_GSMS_Dump")
public class GSMSdump {
	
	@Id
    @Basic(optional = false)
	@Column (name="Associate_ID")
	private Integer associateCTSId;
	@Column (name="Asso_Name")
	private String associateName;
	@Column (name="Project_ID")
	private Integer projectId;
	private String proj_Name;
	private String facility;
	private Integer seatNumber;
	private String shiftStartTime;
	private String shiftEndTime;
	
	
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
	 * @return the proj_Name
	 */
	public String getProj_Name() {
		return proj_Name;
	}
	/**
	 * @param proj_Name the proj_Name to set
	 */
	public void setProj_Name(String proj_Name) {
		this.proj_Name = proj_Name;
	}
	/**
	 * @return the facility
	 */
	public String getFacility() {
		return facility;
	}
	/**
	 * @param facility the facility to set
	 */
	public void setFacility(String facility) {
		this.facility = facility;
	}
	/**
	 * @return the seatNumber
	 */
	public Integer getSeatNumber() {
		return seatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	/**
	 * @return the shiftStartTime
	 */
	public String getShiftStartTime() {
		return shiftStartTime;
	}
	/**
	 * @param shiftStartTime the shiftStartTime to set
	 */
	public void setShiftStartTime(String shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}
	/**
	 * @return the shiftEndTime
	 */
	public String getShiftEndTime() {
		return shiftEndTime;
	}
	/**
	 * @param shiftEndTime the shiftEndTime to set
	 */
	public void setShiftEndTime(String shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}


	
	
}
