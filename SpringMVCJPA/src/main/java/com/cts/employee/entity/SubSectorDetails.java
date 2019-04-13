package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Sub_Sector_Details")
public class SubSectorDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Sub_Sector_Code")
	private String subSectorCode;
	@Column (name="Sub_Sector_Name")
	private String subSectorName;
	@Column (name="UBS_Segment_Code")
	private String ubsSegmentCode;
	private String active_Status;
	private int updated_By;
	private String updated_Date;
	/**
	 * @return the subSectorCode
	 */
	public String getSubSectorCode() {
		return subSectorCode;
	}
	/**
	 * @param subSectorCode the subSectorCode to set
	 */
	public void setSubSectorCode(String subSectorCode) {
		this.subSectorCode = subSectorCode;
	}
	/**
	 * @return the subSectorName
	 */
	public String getSubSectorName() {
		return subSectorName;
	}
	/**
	 * @param subSectorName the subSectorName to set
	 */
	public void setSubSectorName(String subSectorName) {
		this.subSectorName = subSectorName;
	}
	/**
	 * @return the ubsSegmentCode
	 */
	public String getUbsSegmentCode() {
		return ubsSegmentCode;
	}
	/**
	 * @param ubsSegmentCode the ubsSegmentCode to set
	 */
	public void setUbsSegmentCode(String ubsSegmentCode) {
		this.ubsSegmentCode = ubsSegmentCode;
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
