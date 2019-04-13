package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Tbl_Seat_Details")
public class SeatDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="Seat_Number")
	private String seatNumber;
	private String seat_Type;
	private String wing;
	private String module;
	private String barrier_Type;
	private String floor_Number;
	private String facility_Name;
	private String city;
	private String updated_By;
	private String updated_Date;
	private String allocated_PID;
	private String process_id;
	private String process_name;
	
	
	@Transient
	private AssociateSummary associate;
	
	/**
	 * @return the associate
	 */
	public AssociateSummary getAssociate() {
		return associate;
	}
	/**
	 * @param associate the associate to set
	 */
	public void setAssociate(AssociateSummary associate) {
		this.associate = associate;
	}
	/**
	 * @return the seatNumber
	 */
	public String getSeatNumber() {
		return seatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	/**
	 * @return the seat_Type
	 */
	public String getSeat_Type() {
		return seat_Type;
	}
	/**
	 * @param seat_Type the seat_Type to set
	 */
	public void setSeat_Type(String seat_Type) {
		this.seat_Type = seat_Type;
	}
	/**
	 * @return the wing
	 */
	public String getWing() {
		return wing;
	}
	/**
	 * @param wing the wing to set
	 */
	public void setWing(String wing) {
		this.wing = wing;
	}
	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}
	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}
	/**
	 * @return the barrier_Type
	 */
	public String getBarrier_Type() {
		return barrier_Type;
	}
	/**
	 * @param barrier_Type the barrier_Type to set
	 */
	public void setBarrier_Type(String barrier_Type) {
		this.barrier_Type = barrier_Type;
	}
	/**
	 * @return the floor_Number
	 */
	public String getFloor_Number() {
		return floor_Number;
	}
	/**
	 * @param floor_Number the floor_Number to set
	 */
	public void setFloor_Number(String floor_Number) {
		this.floor_Number = floor_Number;
	}
	/**
	 * @return the facility_Name
	 */
	public String getFacility_Name() {
		return facility_Name;
	}
	/**
	 * @param facility_Name the facility_Name to set
	 */
	public void setFacility_Name(String facility_Name) {
		this.facility_Name = facility_Name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the allocated_PID
	 */
	public String getAllocated_PID() {
		return allocated_PID;
	}
	/**
	 * @param allocated_PID the allocated_PID to set
	 */
	public void setAllocated_PID(String allocated_PID) {
		this.allocated_PID = allocated_PID;
	}
	/**
	 * @return the process_id
	 */
	public String getProcess_id() {
		return process_id;
	}
	/**
	 * @param process_id the process_id to set
	 */
	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}
	/**
	 * @return the process_name
	 */
	public String getProcess_name() {
		return process_name;
	}
	/**
	 * @param process_name the process_name to set
	 */
	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}
	
	
	
}
