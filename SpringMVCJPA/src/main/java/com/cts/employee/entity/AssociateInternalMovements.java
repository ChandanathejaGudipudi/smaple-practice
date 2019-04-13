package com.cts.employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Tbl_Associate_Internal_Movement_Details")
public class AssociateInternalMovements {
	
	@Id
    @Basic(optional = false)
	@Column (name="Associate_Movement_Id")
	private Integer associateMovementId;
	private Integer associate_CTS_Id;
	private Integer old_Project_Id;
	private String old_Project_Name;
	private String old_Process;
	private Integer old_Supervisor_CTS_Id;
	private Integer old_Supervisor_GPIN;
	private String old_Supervisor_Name;
	private Integer old_Project_Manager_CTS_Id;
	private Integer old_Project_Manager_GPIN;
	private String old_Project_Manager_Name;
	private Integer new_Project_Id;
	private String new_Project_Name;
	private String new_Process;
	private Integer new_Supervisor_CTS_Id;
	private Integer new_Supervisor_GPIN;
	private String new_Supervisor_Name;
	private Integer new_Project_Manager_CTS_Id;
	private Integer new_Project_Manager_GPIN;
	private String new_Project_Manager_Name;
	private String associate_Movement_Type;
	private String movement_Effective_Date;
	private String reason;
	private String comments;
	private Integer updated_By;
	private String updated_Date;
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
	 * @return the associateMovementId
	 */
	public Integer getAssociateMovementId() {
		return associateMovementId;
	}
	/**
	 * @param associateMovementId the associateMovementId to set
	 */
	public void setAssociateMovementId(Integer associateMovementId) {
		this.associateMovementId = associateMovementId;
	}
	/**
	 * @return the associate_CTS_Id
	 */
	public Integer getAssociate_CTS_Id() {
		return associate_CTS_Id;
	}
	/**
	 * @param associate_CTS_Id the associate_CTS_Id to set
	 */
	public void setAssociate_CTS_Id(Integer associate_CTS_Id) {
		this.associate_CTS_Id = associate_CTS_Id;
	}
	/**
	 * @return the old_Project_Id
	 */
	public Integer getOld_Project_Id() {
		return old_Project_Id;
	}
	/**
	 * @param old_Project_Id the old_Project_Id to set
	 */
	public void setOld_Project_Id(Integer old_Project_Id) {
		this.old_Project_Id = old_Project_Id;
	}
	/**
	 * @return the old_Project_Name
	 */
	public String getOld_Project_Name() {
		return old_Project_Name;
	}
	/**
	 * @param old_Project_Name the old_Project_Name to set
	 */
	public void setOld_Project_Name(String old_Project_Name) {
		this.old_Project_Name = old_Project_Name;
	}
	/**
	 * @return the old_Process
	 */
	public String getOld_Process() {
		return old_Process;
	}
	/**
	 * @param old_Process the old_Process to set
	 */
	public void setOld_Process(String old_Process) {
		this.old_Process = old_Process;
	}
	/**
	 * @return the old_Supervisor_CTS_Id
	 */
	public Integer getOld_Supervisor_CTS_Id() {
		return old_Supervisor_CTS_Id;
	}
	/**
	 * @param old_Supervisor_CTS_Id the old_Supervisor_CTS_Id to set
	 */
	public void setOld_Supervisor_CTS_Id(Integer old_Supervisor_CTS_Id) {
		this.old_Supervisor_CTS_Id = old_Supervisor_CTS_Id;
	}
	/**
	 * @return the old_Supervisor_GPIN
	 */
	public Integer getOld_Supervisor_GPIN() {
		return old_Supervisor_GPIN;
	}
	/**
	 * @param old_Supervisor_GPIN the old_Supervisor_GPIN to set
	 */
	public void setOld_Supervisor_GPIN(Integer old_Supervisor_GPIN) {
		this.old_Supervisor_GPIN = old_Supervisor_GPIN;
	}
	/**
	 * @return the old_Supervisor_Name
	 */
	public String getOld_Supervisor_Name() {
		return old_Supervisor_Name;
	}
	/**
	 * @param old_Supervisor_Name the old_Supervisor_Name to set
	 */
	public void setOld_Supervisor_Name(String old_Supervisor_Name) {
		this.old_Supervisor_Name = old_Supervisor_Name;
	}
	
	/**
	 * @return the old_Project_Manager_CTS_Id
	 */
	public Integer getOld_Project_Manager_CTS_Id() {
		return old_Project_Manager_CTS_Id;
	}
	/**
	 * @param old_Project_Manager_CTS_Id the old_Project_Manager_CTS_Id to set
	 */
	public void setOld_Project_Manager_CTS_Id(Integer old_Project_Manager_CTS_Id) {
		this.old_Project_Manager_CTS_Id = old_Project_Manager_CTS_Id;
	}
	/**
	 * @return the old_Project_Manager_GPIN
	 */
	public Integer getOld_Project_Manager_GPIN() {
		return old_Project_Manager_GPIN;
	}
	/**
	 * @param old_Project_Manager_GPIN the old_Project_Manager_GPIN to set
	 */
	public void setOld_Project_Manager_GPIN(Integer old_Project_Manager_GPIN) {
		this.old_Project_Manager_GPIN = old_Project_Manager_GPIN;
	}
	/**
	 * @return the old_Project_Manager_Name
	 */
	public String getOld_Project_Manager_Name() {
		return old_Project_Manager_Name;
	}
	/**
	 * @param old_Project_Manager_Name the old_Project_Manager_Name to set
	 */
	public void setOld_Project_Manager_Name(String old_Project_Manager_Name) {
		this.old_Project_Manager_Name = old_Project_Manager_Name;
	}
	/**
	 * @return the new_Project_Id
	 */
	public Integer getNew_Project_Id() {
		return new_Project_Id;
	}
	/**
	 * @param new_Project_Id the new_Project_Id to set
	 */
	public void setNew_Project_Id(Integer new_Project_Id) {
		this.new_Project_Id = new_Project_Id;
	}
	/**
	 * @return the new_Project_Name
	 */
	public String getNew_Project_Name() {
		return new_Project_Name;
	}
	/**
	 * @param new_Project_Name the new_Project_Name to set
	 */
	public void setNew_Project_Name(String new_Project_Name) {
		this.new_Project_Name = new_Project_Name;
	}
	/**
	 * @return the new_Process
	 */
	public String getNew_Process() {
		return new_Process;
	}
	/**
	 * @param new_Process the new_Process to set
	 */
	public void setNew_Process(String new_Process) {
		this.new_Process = new_Process;
	}
	/**
	 * @return the new_Supervisor_CTS_Id
	 */
	public Integer getNew_Supervisor_CTS_Id() {
		return new_Supervisor_CTS_Id;
	}
	/**
	 * @param new_Supervisor_CTS_Id the new_Supervisor_CTS_Id to set
	 */
	public void setNew_Supervisor_CTS_Id(Integer new_Supervisor_CTS_Id) {
		this.new_Supervisor_CTS_Id = new_Supervisor_CTS_Id;
	}
	/**
	 * @return the new_Supervisor_GPIN
	 */
	public Integer getNew_Supervisor_GPIN() {
		return new_Supervisor_GPIN;
	}
	/**
	 * @param new_Supervisor_GPIN the new_Supervisor_GPIN to set
	 */
	public void setNew_Supervisor_GPIN(Integer new_Supervisor_GPIN) {
		this.new_Supervisor_GPIN = new_Supervisor_GPIN;
	}
	/**
	 * @return the new_Supervisor_Name
	 */
	public String getNew_Supervisor_Name() {
		return new_Supervisor_Name;
	}
	/**
	 * @param new_Supervisor_Name the new_Supervisor_Name to set
	 */
	public void setNew_Supervisor_Name(String new_Supervisor_Name) {
		this.new_Supervisor_Name = new_Supervisor_Name;
	}
	/**
	 * @return the new_Project_Manager_CTS_Id
	 */
	public Integer getNew_Project_Manager_CTS_Id() {
		return new_Project_Manager_CTS_Id;
	}
	/**
	 * @param new_Project_Manager_CTS_Id the new_Project_Manager_CTS_Id to set
	 */
	public void setNew_Project_Manager_CTS_Id(Integer new_Project_Manager_CTS_Id) {
		this.new_Project_Manager_CTS_Id = new_Project_Manager_CTS_Id;
	}
	/**
	 * @return the new_Project_Manager_GPIN
	 */
	public Integer getNew_Project_Manager_GPIN() {
		return new_Project_Manager_GPIN;
	}
	/**
	 * @param new_Project_Manager_GPIN the new_Project_Manager_GPIN to set
	 */
	public void setNew_Project_Manager_GPIN(Integer new_Project_Manager_GPIN) {
		this.new_Project_Manager_GPIN = new_Project_Manager_GPIN;
	}
	/**
	 * @return the new_Project_Manager_Name
	 */
	public String getNew_Project_Manager_Name() {
		return new_Project_Manager_Name;
	}
	/**
	 * @param new_Project_Manager_Name the new_Project_Manager_Name to set
	 */
	public void setNew_Project_Manager_Name(String new_Project_Manager_Name) {
		this.new_Project_Manager_Name = new_Project_Manager_Name;
	}
	/**
	 * @return the associate_Movement_Type
	 */
	public String getAssociate_Movement_Type() {
		return associate_Movement_Type;
	}
	/**
	 * @param associate_Movement_Type the associate_Movement_Type to set
	 */
	public void setAssociate_Movement_Type(String associate_Movement_Type) {
		this.associate_Movement_Type = associate_Movement_Type;
	}
	/**
	 * @return the movement_Effective_Date
	 */
	public String getMovement_Effective_Date() {
		return movement_Effective_Date;
	}
	/**
	 * @param movement_Effective_Date the movement_Effective_Date to set
	 */
	public void setMovement_Effective_Date(String movement_Effective_Date) {
		this.movement_Effective_Date = movement_Effective_Date;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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
	public Integer getUpdated_By() {
		return updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(Integer updated_By) {
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
