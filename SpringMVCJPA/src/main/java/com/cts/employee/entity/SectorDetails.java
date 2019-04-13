package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Sector_Details")
public class SectorDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Sector_Code")
	private String sectorCode;
	@Column (name="Sector_Name")
	private String sectorName;
	@Column (name="Department_Code")
	private String departmentCode;
	private String active_Status;
	private int updated_By;
	private String updated_Date;
	/**
	 * @return the sectorCode
	 */
	public String getSectorCode() {
		return sectorCode;
	}
	/**
	 * @param sectorCode the sectorCode to set
	 */
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
	/**
	 * @return the sectorName
	 */
	public String getSectorName() {
		return sectorName;
	}
	/**
	 * @param sectorName the sectorName to set
	 */
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	/**
	 * @return the departmentCode
	 */
	public String getDepartmentCode() {
		return departmentCode;
	}
	/**
	 * @param departmentCode the departmentCode to set
	 */
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
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
