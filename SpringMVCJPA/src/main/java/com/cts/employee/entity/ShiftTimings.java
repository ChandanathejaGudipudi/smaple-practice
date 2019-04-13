package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_shift_timing_details")
public class ShiftTimings {

	@Id
    @Basic(optional = false)
	@Column (name="Shift_Timing_Code")
	private String shiftTimingCode;
	@Column (name="Shift_Timing")
	private String shiftTiming;
	private int updated_By;
	private String updated_Date;
	
	/**
	 * @return the shiftTimingCode
	 */
	public String getShiftTimingCode() {
		return shiftTimingCode;
	}
	/**
	 * @param shiftTimingCode the shiftTimingCode to set
	 */
	public void setShiftTimingCode(String shiftTimingCode) {
		this.shiftTimingCode = shiftTimingCode;
	}
	/**
	 * @return the shift_Timing
	 */
	public String getShiftTiming() {
		return shiftTiming;
	}
	/**
	 * @param shift_Timing the shift_Timing to set
	 */
	public void setShiftTiming(String shiftTiming) {
		this.shiftTiming = shiftTiming;
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
