package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cts_grade_details")
public class CtsGrade {

	@Id
    @Basic(optional = false)
	@Column (name="CTS_Grade_Code")
	private String cTSGradeCode;
	@Column (name="CTS_Grade")
	private String cTSGrade;
	private String cTS_Designation;
	private String Active_Status;
	private int updated_By;
	private String updated_Date;
	
	/**
	 * @return the cTSGradeCode
	 */
	public String getcTSGradeCode() {
		return cTSGradeCode;
	}
	/**
	 * @param cTSGradeCode the cTSGradeCode to set
	 */
	public void setcTSGradeCode(String cTSGradeCode) {
		this.cTSGradeCode = cTSGradeCode;
	}
	/**
	 * @return the cTS_Grade
	 */
	public String getcTSGrade() {
		return cTSGrade;
	}
	/**
	 * @param cTS_Grade the cTS_Grade to set
	 */
	public void setcTSGrade(String cTSGrade) {
		this.cTSGrade = cTSGrade;
	}
	/**
	 * @return the cTS_Designation
	 */
	public String getcTS_Designation() {
		return cTS_Designation;
	}
	/**
	 * @param cTS_Designation the cTS_Designation to set
	 */
	public void setcTS_Designation(String cTS_Designation) {
		this.cTS_Designation = cTS_Designation;
	}
	/**
	 * @return the active_Status
	 */
	public String getActive_Status() {
		return Active_Status;
	}
	/**
	 * @param active_Status the active_Status to set
	 */
	public void setActive_Status(String active_Status) {
		Active_Status = active_Status;
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
