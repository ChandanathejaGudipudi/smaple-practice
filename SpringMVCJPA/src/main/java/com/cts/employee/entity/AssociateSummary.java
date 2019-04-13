package com.cts.employee.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Tbl_Associate_Summary")
public class AssociateSummary {

	@Id 
	@Basic(optional = false)
	@Column (name="ASSOCIATE_CTS_ID")
	private Integer associateCTSId;
	private Integer GPIN;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String full_Name;
	private String gender;
	private String marital_Status;
	private String Cts_DOJ;
	private String UBS_Latest_Hire_Date;
	private String associate_Status;
	@Column (name="PROJECT_ID")
	private Integer projectId;
	private String project_Name;
	private String process_Code;
	private String process;
	private String sub_Process_Code;
	private String sub_Process;
	private String team;
	private String region;
	private String CTS_Grade;
	private String CTS_Grade_Effective_Date;
	private String billability_Status;
	private String billability_Grade;
	private String billability_Effective_Date;
	private Integer supervisor_CTS_Id;
	private Integer supervisor_GPIN;
	private String supervisor_Name;
	private Integer project_Manager_CTS_Id;
	private Integer project_Manager_GPIN;
	private String project_Manager_Name;
	private String BCP_Critical_Status;
	@Column (name="Seat_Number")
	private String seatNumber;
	private String shift_Timing;
	private String block_Leave_From;
	private String block_Leave_To;
	private String block_Leave_Status;
	private String hRi_Update_Status;
	private String associate_User_Name;
	private String VDI_Number;
	private String associate_CTS_Email;
	private String associate_UBS_Email;
	private String associate_Contact_Number;
	private String associate_Address;
	private String associate_Movement_Type;
	private String attrition_Type;
	private String reason;
	private String movement_Effective_Date;
	private Integer updated_By;
	private String updated_Date;
	private String mode;
	private String previous_Employer;
	private String previous_Experience;
	private String gpn_Deactivation_raised;
	private String gpn_Deatctivation_Tkt_Num;
	
	
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Transient
	private List<Integer> projectIds;
	@Transient
	private List<String> BCP_Critical_Statuses;
	@Transient
	private List<String> shiftTimings;
	@Transient
	private List<String> cTSGrades;
	@Transient
	private List<String> associateStatus;
	@Transient
	private List<String> associateBillabilityStatus;
	@Transient
	private List<String> associateBillabilityGrade;
	@Transient
	private List<String> associateMovemntType;
	@Transient
	private List<String> attritionType;
	@Transient
	private List<String> blockLeaveStatus;
	@Transient
	private List<String> hRiUpdateStatus;
	@Transient
	private List<String> regions;
	
	

	
	/**
	 * @return the cTSGrades
	 */
	public List<String> getcTSGrades() {
		return cTSGrades;
	}
	/**
	 * @param cTSGrades the cTSGrades to set
	 */
	public void setcTSGrades(List<String> cTSGrades) {
		this.cTSGrades = cTSGrades;
	}
	/**
	 * @return the uBS_Latest_Hire_Date
	 */
	public String getUBS_Latest_Hire_Date() {
		return UBS_Latest_Hire_Date;
	}
	/**
	 * @param uBS_Latest_Hire_Date the uBS_Latest_Hire_Date to set
	 */
	public void setUBS_Latest_Hire_Date(String uBS_Latest_Hire_Date) {
		UBS_Latest_Hire_Date = uBS_Latest_Hire_Date;
	}
	/**
	 * @return the cTS_Grade_Effective_Date
	 */
	public String getCTS_Grade_Effective_Date() {
		return CTS_Grade_Effective_Date;
	}
	/**
	 * @param cTS_Grade_Effective_Date the cTS_Grade_Effective_Date to set
	 */
	public void setCTS_Grade_Effective_Date(String cTS_Grade_Effective_Date) {
		CTS_Grade_Effective_Date = cTS_Grade_Effective_Date;
	}
	/**
	 * @return the billability_Effective_Date
	 */
	public String getBillability_Effective_Date() {
		return billability_Effective_Date;
	}
	/**
	 * @param billability_Effective_Date the billability_Effective_Date to set
	 */
	public void setBillability_Effective_Date(String billability_Effective_Date) {
		this.billability_Effective_Date = billability_Effective_Date;
	}
	/**
	 * @return the block_Leave_From
	 */
	public String getBlock_Leave_From() {
		return block_Leave_From;
	}
	/**
	 * @param block_Leave_From the block_Leave_From to set
	 */
	public void setBlock_Leave_From(String block_Leave_From) {
		this.block_Leave_From = block_Leave_From;
	}
	/**
	 * @return the block_Leave_To
	 */
	public String getBlock_Leave_To() {
		return block_Leave_To;
	}
	/**
	 * @param block_Leave_To the block_Leave_To to set
	 */
	public void setBlock_Leave_To(String block_Leave_To) {
		this.block_Leave_To = block_Leave_To;
	}
	@Transient
	private List<Integer> associate_Supervisor_CTS_Ids;
	@Transient
	private List<Integer> associate_Project_Manager_CTS_Ids;
	
	
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
	 * @return the cts_DOJ
	 */
	public String getCts_DOJ() {
		return Cts_DOJ;
	}
	/**
	 * @param cts_DOJ the cts_DOJ to set
	 */
	public void setCts_DOJ(String cts_DOJ) {
		Cts_DOJ = cts_DOJ;
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
	public List<Integer> getProjectIds() {
		return projectIds;
	}
	/**
	 * @param projectIds the projectIds to set
	 */
	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}
	/**
	 * @return the bCP_Critical_Statuses
	 */
	public List<String> getBCP_Critical_Statuses() {
		return BCP_Critical_Statuses;
	}
	/**
	 * @param bCP_Critical_Statuses the bCP_Critical_Statuses to set
	 */
	public void setBCP_Critical_Statuses(List<String> bCP_Critical_Statuses) {
		BCP_Critical_Statuses = bCP_Critical_Statuses;
	}
	/**
	 * @return the shiftTimings
	 */
	public List<String> getShiftTimings() {
		return shiftTimings;
	}
	/**
	 * @param shiftTimings the shiftTimings to set
	 */
	public void setShiftTimings(List<String> shiftTimings) {
		this.shiftTimings = shiftTimings;
	}
	public List<String> getAssociateStatus() {
		return associateStatus;
	}
	public void setAssociateStatus(
			List<String> associateStatus) {
		this.associateStatus = associateStatus;
	}
	/**
	 * @return the associateBillabilityStatus
	 */
	public List<String> getAssociateBillabilityStatus() {
		return associateBillabilityStatus;
	}
	/**
	 * @param associateBillabilityStatus the associateBillabilityStatus to set
	 */
	public void setAssociateBillabilityStatus(
			List<String> associateBillabilityStatus) {
		this.associateBillabilityStatus = associateBillabilityStatus;
	}
	public List<String> getAssociateBillabilityGrade() {
		return associateBillabilityGrade;
	}
	public void setAssociateBillabilityGrade(
			List<String> associateBillabilityGrade) {
		this.associateBillabilityGrade = associateBillabilityGrade;
	}
	public List<String> getAssociateMovemntType() {
		return associateMovemntType;
	}
	public void setAssociateMovemntType(List<String> associateMovemntType) {
		this.associateMovemntType = associateMovemntType;
	}
	/**
	 * @return the attritionType
	 */
	public List<String> getAttritionType() {
		return attritionType;
	}
	/**
	 * @param attritionType the attritionType to set
	 */
	public void setAttritionType(List<String> attritionType) {
		this.attritionType = attritionType;
	}
	/**
	 * @return the associate_Supervisor_CTS_Ids
	 */
	public List<Integer> getAssociate_Supervisor_CTS_Ids() {
		return associate_Supervisor_CTS_Ids;
	}
	/**
	 * @param associate_Supervisor_CTS_Ids the associate_Supervisor_CTS_Ids to set
	 */
	public void setAssociate_Supervisor_CTS_Ids(
			List<Integer> associate_Supervisor_CTS_Ids) {
		this.associate_Supervisor_CTS_Ids = associate_Supervisor_CTS_Ids;
	}
	/**
	 * @return the associate_Project_Manager_CTS_Ids
	 */
	public List<Integer> getAssociate_Project_Manager_CTS_Ids() {
		return associate_Project_Manager_CTS_Ids;
	}
	/**
	 * @param associate_Project_Manager_CTS_Ids the associate_Project_Manager_CTS_Ids to set
	 */
	public void setAssociate_Project_Manager_CTS_Ids(
			List<Integer> associate_Project_Manager_CTS_Ids) {
		this.associate_Project_Manager_CTS_Ids = associate_Project_Manager_CTS_Ids;
	}
	/**
	 * @return the associateCTSId
	 */
	public Integer getAssociateCTSId() {
		return associateCTSId;
	}
	/**
	 * @param associateCTSId the associateCTSId to set
	 */
	public void setAssociateCTSId(Integer associateCTSId) {
		this.associateCTSId = associateCTSId;
	}
	/**
	 * @return the gPIN
	 */
	public Integer getGPIN() {
		return GPIN;
	}
	/**
	 * @param gPIN the gPIN to set
	 */
	public void setGPIN(Integer gPIN) {
		GPIN = gPIN;
	}
	/**
	 * @return the first_Name
	 */
	public String getFirst_Name() {
		return first_Name;
	}
	/**
	 * @param first_Name the first_Name to set
	 */
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	/**
	 * @return the middle_Name
	 */
	public String getMiddle_Name() {
		return middle_Name;
	}
	/**
	 * @param middle_Name the middle_Name to set
	 */
	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}
	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return last_Name;
	}
	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	/**
	 * @return the full_Name
	 */
	public String getFull_Name() {
		return full_Name;
	}
	/**
	 * @param full_Name the full_Name to set
	 */
	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the marital_Status
	 */
	public String getMarital_Status() {
		return marital_Status;
	}
	/**
	 * @param marital_Status the marital_Status to set
	 */
	public void setMarital_Status(String marital_Status) {
		this.marital_Status = marital_Status;
	}
	/**
	 * @return the associate_Status
	 */
	public String getAssociate_Status() {
		return associate_Status;
	}
	/**
	 * @param associate_Status the associate_Status to set
	 */
	public void setAssociate_Status(String associate_Status) {
		this.associate_Status = associate_Status;
	}
	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the project_Name
	 */
	public String getProject_Name() {
		return project_Name;
	}
	/**
	 * @param project_Name the project_Name to set
	 */
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	/**
	 * @return the process_Code
	 */
	public String getProcess_Code() {
		return process_Code;
	}
	/**
	 * @param process_Code the process_Code to set
	 */
	public void setProcess_Code(String process_Code) {
		this.process_Code = process_Code;
	}
	/**
	 * @return the sub_Process_Code
	 */
	public String getSub_Process_Code() {
		return sub_Process_Code;
	}
	/**
	 * @param sub_Process_Code the sub_Process_Code to set
	 */
	public void setSub_Process_Code(String sub_Process_Code) {
		this.sub_Process_Code = sub_Process_Code;
	}
	
	
	/**
	 * @return the billability_Status
	 */
	public String getBillability_Status() {
		return billability_Status;
	}
	/**
	 * @param billability_Status the billability_Status to set
	 */
	public void setBillability_Status(String billability_Status) {
		this.billability_Status = billability_Status;
	}
	/**
	 * @return the billability_Grade
	 */
	public String getBillability_Grade() {
		return billability_Grade;
	}
	/**
	 * @param billability_Grade the billability_Grade to set
	 */
	public void setBillability_Grade(String billability_Grade) {
		this.billability_Grade = billability_Grade;
	}
	/**
	 * @return the supervisor_CTS_Id
	 */
	public Integer getSupervisor_CTS_Id() {
		return supervisor_CTS_Id;
	}
	/**
	 * @param supervisor_CTS_Id the supervisor_CTS_Id to set
	 */
	public void setSupervisor_CTS_Id(Integer supervisor_CTS_Id) {
		this.supervisor_CTS_Id = supervisor_CTS_Id;
	}
	/**
	 * @return the supervisor_GPIN
	 */
	public Integer getSupervisor_GPIN() {
		return supervisor_GPIN;
	}
	/**
	 * @param supervisor_GPIN the supervisor_GPIN to set
	 */
	public void setSupervisor_GPIN(Integer supervisor_GPIN) {
		this.supervisor_GPIN = supervisor_GPIN;
	}
	/**
	 * @return the supervisor_Name
	 */
	public String getSupervisor_Name() {
		return supervisor_Name;
	}
	/**
	 * @param supervisor_Name the supervisor_Name to set
	 */
	public void setSupervisor_Name(String supervisor_Name) {
		this.supervisor_Name = supervisor_Name;
	}
	/**
	 * @return the project_Manager_CTS_Id
	 */
	public Integer getProject_Manager_CTS_Id() {
		return project_Manager_CTS_Id;
	}
	/**
	 * @param project_Manager_CTS_Id the project_Manager_CTS_Id to set
	 */
	public void setProject_Manager_CTS_Id(Integer project_Manager_CTS_Id) {
		this.project_Manager_CTS_Id = project_Manager_CTS_Id;
	}
	/**
	 * @return the project_Manager_GPIN
	 */
	public Integer getProject_Manager_GPIN() {
		return project_Manager_GPIN;
	}
	/**
	 * @param project_Manager_GPIN the project_Manager_GPIN to set
	 */
	public void setProject_Manager_GPIN(Integer project_Manager_GPIN) {
		this.project_Manager_GPIN = project_Manager_GPIN;
	}
	/**
	 * @return the project_Manager_Name
	 */
	public String getProject_Manager_Name() {
		return project_Manager_Name;
	}
	/**
	 * @param project_Manager_Name the project_Manager_Name to set
	 */
	public void setProject_Manager_Name(String project_Manager_Name) {
		this.project_Manager_Name = project_Manager_Name;
	}
	/**
	 * @return the bCP_Critical_Status
	 */
	public String getBCP_Critical_Status() {
		return BCP_Critical_Status;
	}
	/**
	 * @param bCP_Critical_Status the bCP_Critical_Status to set
	 */
	public void setBCP_Critical_Status(String bCP_Critical_Status) {
		BCP_Critical_Status = bCP_Critical_Status;
	}
	/**
	 * @return the shift_Timing
	 */
	public String getShift_Timing() {
		return shift_Timing;
	}
	/**
	 * @param shift_Timing the shift_Timing to set
	 */
	public void setShift_Timing(String shift_Timing) {
		this.shift_Timing = shift_Timing;
	}
	/**
	 * @return the block_Leave_Status
	 */
	public String getBlock_Leave_Status() {
		return block_Leave_Status;
	}
	/**
	 * @param block_Leave_Status the block_Leave_Status to set
	 */
	public void setBlock_Leave_Status(String block_Leave_Status) {
		this.block_Leave_Status = block_Leave_Status;
	}
	/**
	 * @return the hRi_Update_Status
	 */
	public String gethRi_Update_Status() {
		return hRi_Update_Status;
	}
	/**
	 * @param hRi_Update_Status the hRi_Update_Status to set
	 */
	public void sethRi_Update_Status(String hRi_Update_Status) {
		this.hRi_Update_Status = hRi_Update_Status;
	}
	/**
	 * @return the associate_User_Name
	 */
	public String getAssociate_User_Name() {
		return associate_User_Name;
	}
	/**
	 * @param associate_User_Name the associate_User_Name to set
	 */
	public void setAssociate_User_Name(String associate_User_Name) {
		this.associate_User_Name = associate_User_Name;
	}
	/**
	 * @return the vDI_Number
	 */
	public String getVDI_Number() {
		return VDI_Number;
	}
	/**
	 * @param vDI_Number the vDI_Number to set
	 */
	public void setVDI_Number(String vDI_Number) {
		VDI_Number = vDI_Number;
	}
	/**
	 * @return the associate_CTS_Email
	 */
	public String getAssociate_CTS_Email() {
		return associate_CTS_Email;
	}
	/**
	 * @param associate_CTS_Email the associate_CTS_Email to set
	 */
	public void setAssociate_CTS_Email(String associate_CTS_Email) {
		this.associate_CTS_Email = associate_CTS_Email;
	}
	/**
	 * @return the associate_UBS_Email
	 */
	public String getAssociate_UBS_Email() {
		return associate_UBS_Email;
	}
	/**
	 * @param associate_UBS_Email the associate_UBS_Email to set
	 */
	public void setAssociate_UBS_Email(String associate_UBS_Email) {
		this.associate_UBS_Email = associate_UBS_Email;
	}
	/**
	 * @return the associate_Contact_Number
	 */
	public String getAssociate_Contact_Number() {
		return associate_Contact_Number;
	}
	/**
	 * @param associate_Contact_Number the associate_Contact_Number to set
	 */
	public void setAssociate_Contact_Number(String associate_Contact_Number) {
		this.associate_Contact_Number = associate_Contact_Number;
	}
	/**
	 * @return the associate_Address
	 */
	public String getAssociate_Address() {
		return associate_Address;
	}
	/**
	 * @param associate_Address the associate_Address to set
	 */
	public void setAssociate_Address(String associate_Address) {
		this.associate_Address = associate_Address;
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
	 * @return the attrition_Type
	 */
	public String getAttrition_Type() {
		return attrition_Type;
	}
	/**
	 * @param attrition_Type the attrition_Type to set
	 */
	public void setAttrition_Type(String attrition_Type) {
		this.attrition_Type = attrition_Type;
	}
	/**
	 * @return the blockLeaveStatus
	 */
	public List<String> getBlockLeaveStatus() {
		return blockLeaveStatus;
	}
	/**
	 * @param blockLeaveStatus the blockLeaveStatus to set
	 */
	public void setBlockLeaveStatus(List<String> blockLeaveStatus) {
		this.blockLeaveStatus = blockLeaveStatus;
	}
	/**
	 * @return the hRiUpdateStatus
	 */
	public List<String> gethRiUpdateStatus() {
		return hRiUpdateStatus;
	}
	/**
	 * @param hRiUpdateStatus the hRiUpdateStatus to set
	 */
	public void sethRiUpdateStatus(List<String> hRiUpdateStatus) {
		this.hRiUpdateStatus = hRiUpdateStatus;
	}
	/**
	 * @return the regions
	 */
	public List<String> getRegions() {
		return regions;
	}
	/**
	 * @param regions the regions to set
	 */
	public void setRegions(List<String> regions) {
		this.regions = regions;
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
	 * @return the process
	 */
	public String getProcess() {
		return process;
	}
	/**
	 * @param process the process to set
	 */
	public void setProcess(String process) {
		this.process = process;
	}
	/**
	 * @return the sub_Process
	 */
	public String getSub_Process() {
		return sub_Process;
	}
	/**
	 * @param sub_Process the sub_Process to set
	 */
	public void setSub_Process(String sub_Process) {
		this.sub_Process = sub_Process;
	}
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the cTS_Grade
	 */
	public String getCTS_Grade() {
		return CTS_Grade;
	}
	/**
	 * @param cTS_Grade the cTS_Grade to set
	 */
	public void setCTS_Grade(String cTS_Grade) {
		CTS_Grade = cTS_Grade;
	}
	/**
	 * @return the previous_Employer
	 */
	public String getPrevious_Employer() {
		return previous_Employer;
	}
	/**
	 * @param previous_Employer the previous_Employer to set
	 */
	public void setPrevious_Employer(String previous_Employer) {
		this.previous_Employer = previous_Employer;
	}
	/**
	 * @return the previous_Experience
	 */
	public String getPrevious_Experience() {
		return previous_Experience;
	}
	/**
	 * @param previous_Experience the previous_Experience to set
	 */
	public void setPrevious_Experience(String previous_Experience) {
		this.previous_Experience = previous_Experience;
	}
	/**
	 * @return the gpn_Deactivation_raised
	 */
	public String getGpn_Deactivation_raised() {
		return gpn_Deactivation_raised;
	}
	/**
	 * @param gpn_Deactivation_raised the gpn_Deactivation_raised to set
	 */
	public void setGpn_Deactivation_raised(String gpn_Deactivation_raised) {
		this.gpn_Deactivation_raised = gpn_Deactivation_raised;
	}
	/**
	 * @return the gpn_Deatctivation_Tkt_Num
	 */
	public String getGpn_Deatctivation_Tkt_Num() {
		return gpn_Deatctivation_Tkt_Num;
	}
	/**
	 * @param gpn_Deatctivation_Tkt_Num the gpn_Deatctivation_Tkt_Num to set
	 */
	public void setGpn_Deatctivation_Tkt_Num(String gpn_Deatctivation_Tkt_Num) {
		this.gpn_Deatctivation_Tkt_Num = gpn_Deatctivation_Tkt_Num;
	}
	
	

	
}
