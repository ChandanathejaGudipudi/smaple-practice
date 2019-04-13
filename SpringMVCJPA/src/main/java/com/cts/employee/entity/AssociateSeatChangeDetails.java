package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_associate_seat_change_details")
public class AssociateSeatChangeDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="ASSOCIATE_CTS_ID")
	private int associateCTSId;
	private String old_Seat_Number;
	private String old_Shift_Timing;
	private String new_Seat_Number;
	private String new_Shift_Timing;
	private String comments;
	private String updated_By;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date updated_Date;
	/**
	 * @return the associateCTSId
	 */
	public int getAssociateCTSId() {
		return associateCTSId;
	}
	/**
	 * @param associateCTSId the associateCTSId to set
	 */
	public void setAssociateCTSId(int associateCTSId) {
		this.associateCTSId = associateCTSId;
	}
	/**
	 * @return the previous_Seat_Number
	 */
	
	/**
	 * @return the old_Seat_Number
	 */
	public String getOld_Seat_Number() {
		return old_Seat_Number;
	}
	/**
	 * @param old_Seat_Number the old_Seat_Number to set
	 */
	public void setOld_Seat_Number(String old_Seat_Number) {
		this.old_Seat_Number = old_Seat_Number;
	}
	/**
	 * @return the old_Shift_Timing
	 */
	public String getOld_Shift_Timing() {
		return old_Shift_Timing;
	}
	/**
	 * @param old_Shift_Timing the old_Shift_Timing to set
	 */
	public void setOld_Shift_Timing(String old_Shift_Timing) {
		this.old_Shift_Timing = old_Shift_Timing;
	}
	/**
	 * @return the new_Seat_Number
	 */
	public String getNew_Seat_Number() {
		return new_Seat_Number;
	}
	/**
	 * @param new_Seat_Number the new_Seat_Number to set
	 */
	public void setNew_Seat_Number(String new_Seat_Number) {
		this.new_Seat_Number = new_Seat_Number;
	}
	/**
	 * @return the new_Shift_Timing
	 */
	public String getNew_Shift_Timing() {
		return new_Shift_Timing;
	}
	/**
	 * @param new_Shift_Timing the new_Shift_Timing to set
	 */
	public void setNew_Shift_Timing(String new_Shift_Timing) {
		this.new_Shift_Timing = new_Shift_Timing;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}
	/**
	 * @return the updated_Date
	 *//*
	public Date getUpdated_Date() {
		return updated_Date;
	}
	*//**
	 * @param updated_Date the updated_Date to set
	 *//*
	public void setUpdated_Date(Date updated_Date) {
		this.updated_Date = updated_Date;
	}*/
}
