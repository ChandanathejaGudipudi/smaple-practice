package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_Shift_Config")
public class ShiftConfig {

	@Id
    @Basic(optional = false)
	@Column (name="shift_from")
	private String shiftFrom;
	@Column (name="shift_to")
	private String shiftTo;
	private String allowed;
	/**
	 * @return the shiftFrom
	 */
	public String getShiftFrom() {
		return shiftFrom;
	}
	/**
	 * @param shiftFrom the shiftFrom to set
	 */
	public void setShiftFrom(String shiftFrom) {
		this.shiftFrom = shiftFrom;
	}
	/**
	 * @return the shiftTo
	 */
	public String getShiftTo() {
		return shiftTo;
	}
	/**
	 * @param shiftTo the shiftTo to set
	 */
	public void setShiftTo(String shiftTo) {
		this.shiftTo = shiftTo;
	}
	/**
	 * @return the allowed
	 */
	public String getAllowed() {
		return allowed;
	}
	/**
	 * @param allowed the allowed to set
	 */
	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	
	
}
