package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Team_Details")
public class TeamDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Team_Code")
	private String teamCode;
	@Column (name="Team_Name")
	private String teamName;
	@Column (name="Process_Code")
	private String ProcessCode;
	private String active_Status;
	private int updated_By;
	private String updated_Date;
	
	/**
	 * @return the teamCode
	 */
	public String getTeamCode() {
		return teamCode;
	}
	/**
	 * @param teamCode the teamCode to set
	 */
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the subProcessCode
	 */
	public String getProcessCode() {
		return ProcessCode;
	}
	/**
	 * @param subProcessCode the subProcessCode to set
	 */
	public void setProcessCode(String subProcessCode) {
		this.ProcessCode = subProcessCode;
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
