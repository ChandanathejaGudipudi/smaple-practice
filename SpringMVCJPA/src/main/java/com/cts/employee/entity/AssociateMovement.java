package com.cts.employee.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_associate_internal_movement_details")
public class AssociateMovement {
	
	@Id
    @Basic(optional = false)
	private Integer Associate_CTS_Id;
	private int Old_Project_Id;
	private String Old_Project_Name;
	private int Old_Supervisor_CTS_Id;
	private int Old_Supervisor_GPN;
	private String Old_Supervisor_Name;
	private int Old_Project_Manager_CTS_Id;
	private int Old_Project_Manager_GPN;
	private String Old_Project_Manager_Name;
	private String Old_Sub_Process_Code;
	private String Old_Sub_Process;
	private String Old_Process_Code;
	private String Old_Process;
	private String Old_Region_Code;
	private String Old_Region;
	private int New_Project_Id;
	private String New_Project_Name;
	private int New_Supervisor_CTS_Id;
	private int New_Supervisor_GPN;
	private String New_Supervisor_Name;
	private int New_Project_Manager_CTS_Id;
	private int New_Project_Manager_GPN;
	private String New_Project_Manager_Name;
	private String New_Sub_Process_Code;
	private String New_Sub_Process;
	private String New_Process_Code;
	private String New_Process;
	private String New_Region_Code;
	private String New_Region;
	private Date Movement_Date;
	private String Comments;
	private String Updated_By;
	private Date Updated_Date;
	/**
	 * @return the associate_CTS_Id
	 */
	public Integer getAssociate_CTS_Id() {
		return Associate_CTS_Id;
	}
	/**
	 * @param associate_CTS_Id the associate_CTS_Id to set
	 */
	public void setAssociate_CTS_Id(Integer associate_CTS_Id) {
		Associate_CTS_Id = associate_CTS_Id;
	}
	/**
	 * @return the old_Project_Id
	 */
	public int getOld_Project_Id() {
		return Old_Project_Id;
	}
	/**
	 * @param old_Project_Id the old_Project_Id to set
	 */
	public void setOld_Project_Id(int old_Project_Id) {
		Old_Project_Id = old_Project_Id;
	}
	/**
	 * @return the old_Project_Name
	 */
	public String getOld_Project_Name() {
		return Old_Project_Name;
	}
	/**
	 * @param old_Project_Name the old_Project_Name to set
	 */
	public void setOld_Project_Name(String old_Project_Name) {
		Old_Project_Name = old_Project_Name;
	}
	/**
	 * @return the old_Supervisor_CTS_Id
	 */
	public int getOld_Supervisor_CTS_Id() {
		return Old_Supervisor_CTS_Id;
	}
	/**
	 * @param old_Supervisor_CTS_Id the old_Supervisor_CTS_Id to set
	 */
	public void setOld_Supervisor_CTS_Id(int old_Supervisor_CTS_Id) {
		Old_Supervisor_CTS_Id = old_Supervisor_CTS_Id;
	}
	/**
	 * @return the old_Supervisor_GPN
	 */
	public int getOld_Supervisor_GPN() {
		return Old_Supervisor_GPN;
	}
	/**
	 * @param old_Supervisor_GPN the old_Supervisor_GPN to set
	 */
	public void setOld_Supervisor_GPN(int old_Supervisor_GPN) {
		Old_Supervisor_GPN = old_Supervisor_GPN;
	}
	/**
	 * @return the old_Supervisor_Name
	 */
	public String getOld_Supervisor_Name() {
		return Old_Supervisor_Name;
	}
	/**
	 * @param old_Supervisor_Name the old_Supervisor_Name to set
	 */
	public void setOld_Supervisor_Name(String old_Supervisor_Name) {
		Old_Supervisor_Name = old_Supervisor_Name;
	}
	/**
	 * @return the old_Project_Manager_CTS_Id
	 */
	public int getOld_Project_Manager_CTS_Id() {
		return Old_Project_Manager_CTS_Id;
	}
	/**
	 * @param old_Project_Manager_CTS_Id the old_Project_Manager_CTS_Id to set
	 */
	public void setOld_Project_Manager_CTS_Id(int old_Project_Manager_CTS_Id) {
		Old_Project_Manager_CTS_Id = old_Project_Manager_CTS_Id;
	}
	/**
	 * @return the old_Project_Manager_GPN
	 */
	public int getOld_Project_Manager_GPN() {
		return Old_Project_Manager_GPN;
	}
	/**
	 * @param old_Project_Manager_GPN the old_Project_Manager_GPN to set
	 */
	public void setOld_Project_Manager_GPN(int old_Project_Manager_GPN) {
		Old_Project_Manager_GPN = old_Project_Manager_GPN;
	}
	/**
	 * @return the old_Project_Manager_Name
	 */
	public String getOld_Project_Manager_Name() {
		return Old_Project_Manager_Name;
	}
	/**
	 * @param old_Project_Manager_Name the old_Project_Manager_Name to set
	 */
	public void setOld_Project_Manager_Name(String old_Project_Manager_Name) {
		Old_Project_Manager_Name = old_Project_Manager_Name;
	}
	/**
	 * @return the old_Line_Manager_Id
	 */
		/**
	 * @return the old_Sub_Process_Code
	 */
	public String getOld_Sub_Process_Code() {
		return Old_Sub_Process_Code;
	}
	/**
	 * @param old_Sub_Process_Code the old_Sub_Process_Code to set
	 */
	public void setOld_Sub_Process_Code(String old_Sub_Process_Code) {
		Old_Sub_Process_Code = old_Sub_Process_Code;
	}
	/**
	 * @return the old_Sub_Process
	 */
	public String getOld_Sub_Process() {
		return Old_Sub_Process;
	}
	/**
	 * @param old_Sub_Process the old_Sub_Process to set
	 */
	public void setOld_Sub_Process(String old_Sub_Process) {
		Old_Sub_Process = old_Sub_Process;
	}
	/**
	 * @return the old_Process_Code
	 */
	public String getOld_Process_Code() {
		return Old_Process_Code;
	}
	/**
	 * @param old_Process_Code the old_Process_Code to set
	 */
	public void setOld_Process_Code(String old_Process_Code) {
		Old_Process_Code = old_Process_Code;
	}
	/**
	 * @return the old_Process
	 */
	public String getOld_Process() {
		return Old_Process;
	}
	/**
	 * @param old_Process the old_Process to set
	 */
	public void setOld_Process(String old_Process) {
		Old_Process = old_Process;
	}
	/**
	 * @return the old_Region_Code
	 */
	public String getOld_Region_Code() {
		return Old_Region_Code;
	}
	/**
	 * @param old_Region_Code the old_Region_Code to set
	 */
	public void setOld_Region_Code(String old_Region_Code) {
		Old_Region_Code = old_Region_Code;
	}
	/**
	 * @return the old_Region
	 */
	public String getOld_Region() {
		return Old_Region;
	}
	/**
	 * @param old_Region the old_Region to set
	 */
	public void setOld_Region(String old_Region) {
		Old_Region = old_Region;
	}
	/**
	 * @return the new_Project_Id
	 */
	public int getNew_Project_Id() {
		return New_Project_Id;
	}
	/**
	 * @param new_Project_Id the new_Project_Id to set
	 */
	public void setNew_Project_Id(int new_Project_Id) {
		New_Project_Id = new_Project_Id;
	}
	/**
	 * @return the new_Project_Name
	 */
	public String getNew_Project_Name() {
		return New_Project_Name;
	}
	/**
	 * @param new_Project_Name the new_Project_Name to set
	 */
	public void setNew_Project_Name(String new_Project_Name) {
		New_Project_Name = new_Project_Name;
	}
	/**
	 * @return the new_Supervisor_CTS_Id
	 */
	public int getNew_Supervisor_CTS_Id() {
		return New_Supervisor_CTS_Id;
	}
	/**
	 * @param new_Supervisor_CTS_Id the new_Supervisor_CTS_Id to set
	 */
	public void setNew_Supervisor_CTS_Id(int new_Supervisor_CTS_Id) {
		New_Supervisor_CTS_Id = new_Supervisor_CTS_Id;
	}
	/**
	 * @return the new_Supervisor_GPN
	 */
	public int getNew_Supervisor_GPN() {
		return New_Supervisor_GPN;
	}
	/**
	 * @param new_Supervisor_GPN the new_Supervisor_GPN to set
	 */
	public void setNew_Supervisor_GPN(int new_Supervisor_GPN) {
		New_Supervisor_GPN = new_Supervisor_GPN;
	}
	/**
	 * @return the new_Supervisor_Name
	 */
	public String getNew_Supervisor_Name() {
		return New_Supervisor_Name;
	}
	/**
	 * @param new_Supervisor_Name the new_Supervisor_Name to set
	 */
	public void setNew_Supervisor_Name(String new_Supervisor_Name) {
		New_Supervisor_Name = new_Supervisor_Name;
	}
	/**
	 * @return the new_Project_Manager_CTS_Id
	 */
	public int getNew_Project_Manager_CTS_Id() {
		return New_Project_Manager_CTS_Id;
	}
	/**
	 * @param new_Project_Manager_CTS_Id the new_Project_Manager_CTS_Id to set
	 */
	public void setNew_Project_Manager_CTS_Id(int new_Project_Manager_CTS_Id) {
		New_Project_Manager_CTS_Id = new_Project_Manager_CTS_Id;
	}
	/**
	 * @return the new_Project_Manager_GPN
	 */
	public int getNew_Project_Manager_GPN() {
		return New_Project_Manager_GPN;
	}
	/**
	 * @param new_Project_Manager_GPN the new_Project_Manager_GPN to set
	 */
	public void setNew_Project_Manager_GPN(int new_Project_Manager_GPN) {
		New_Project_Manager_GPN = new_Project_Manager_GPN;
	}
	/**
	 * @return the new_Project_Manager_Name
	 */
	public String getNew_Project_Manager_Name() {
		return New_Project_Manager_Name;
	}
	/**
	 * @param new_Project_Manager_Name the new_Project_Manager_Name to set
	 */
	public void setNew_Project_Manager_Name(String new_Project_Manager_Name) {
		New_Project_Manager_Name = new_Project_Manager_Name;
	}
	/**
	 * @return the new_Line_Manager_Id
	 */
	
	/**
	 * @return the new_Sub_Process_Code
	 */
	public String getNew_Sub_Process_Code() {
		return New_Sub_Process_Code;
	}
	/**
	 * @param new_Sub_Process_Code the new_Sub_Process_Code to set
	 */
	public void setNew_Sub_Process_Code(String new_Sub_Process_Code) {
		New_Sub_Process_Code = new_Sub_Process_Code;
	}
	/**
	 * @return the new_Sub_Process
	 */
	public String getNew_Sub_Process() {
		return New_Sub_Process;
	}
	/**
	 * @param new_Sub_Process the new_Sub_Process to set
	 */
	public void setNew_Sub_Process(String new_Sub_Process) {
		New_Sub_Process = new_Sub_Process;
	}
	/**
	 * @return the new_Process_Code
	 */
	public String getNew_Process_Code() {
		return New_Process_Code;
	}
	/**
	 * @param new_Process_Code the new_Process_Code to set
	 */
	public void setNew_Process_Code(String new_Process_Code) {
		New_Process_Code = new_Process_Code;
	}
	/**
	 * @return the new_Process
	 */
	public String getNew_Process() {
		return New_Process;
	}
	/**
	 * @param new_Process the new_Process to set
	 */
	public void setNew_Process(String new_Process) {
		New_Process = new_Process;
	}
	/**
	 * @return the new_Region_Code
	 */
	public String getNew_Region_Code() {
		return New_Region_Code;
	}
	/**
	 * @param new_Region_Code the new_Region_Code to set
	 */
	public void setNew_Region_Code(String new_Region_Code) {
		New_Region_Code = new_Region_Code;
	}
	/**
	 * @return the new_Region
	 */
	public String getNew_Region() {
		return New_Region;
	}
	/**
	 * @param new_Region the new_Region to set
	 */
	public void setNew_Region(String new_Region) {
		New_Region = new_Region;
	}
	/**
	 * @return the movement_Date
	 */
	public Date getMovement_Date() {
		return Movement_Date;
	}
	/**
	 * @param movement_Date the movement_Date to set
	 */
	public void setMovement_Date(Date movement_Date) {
		Movement_Date = movement_Date;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return Comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		Comments = comments;
	}
	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return Updated_By;
	}
	/**
	 * @param updated_By the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	/**
	 * @return the updated_Date
	 */
	public Date getUpdated_Date() {
		return Updated_Date;
	}
	/**
	 * @param updated_Date the updated_Date to set
	 */
	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}
	

}
