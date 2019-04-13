package com.cts.employee.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity
@Table(name = "Tbl_Associate_Summary")
public class AssociateSummary1 {
	
//	@PersistenceContext(unitName = "myUnit")
//    private EntityManager em;
	
	@Id @GeneratedValue
    @Basic(optional = false)
	@Column (name="ASSOCIATE_CTS_ID")
	private Integer associateCTSId;
	private Integer GPIN;
	private String associate_Full_Name;
	private String gender;
	private String marital_Status;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date CTS_DOJ;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date UBS_Latest_Hire_Date;
	@Column (name="PROJECT_ID")
	private Integer projectId;
	private String project_Name;
	private String sub_Process;
	private String process_Code;
	private String process;
	private String region;
	private String BCP_Critical_Status;
	private String seat_Number;
	private String shift_Timings;
//	private String is_It_Shared_Seat;
	private String CTS_Grade;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date CTS_Grade_Effective_Date;
	private String associate_Billability_Status;
	private String associate_Billability_Grade;
//	private Long associate_Billability_Rate;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date associate_Billability_Effective_Date;
	private String associate_Alloc_to_Mult_Projects;
	private String block_Leave_Status;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date block_Leave_From;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date block_Leave_To;
	private String hRi_Update_Status;
	private String associate_User_Name;
	private String VDI_Number;
	private String attrition_Type;
	private String reason;
	private String date_of_Relieving;
	private Integer line_Manager_Id;
	private String line_Manager_Name;
	private Integer associate_Supervisor_CTS_Id;
	private Integer associate_Supervisor_GPN;
	private String associate_Supervisor_Name;
	private Integer associate_Project_Manager_CTS_Id;
	private Integer associate_Project_Manager_GPN;
	private String associate_Project_Manager_Name;
	private String updated_By;
//	@Temporal (TemporalType.TIMESTAMP)
//	private Date updated_Date;
	private String associate_Status;
	
	@Transient
	private List<Integer> projectIds;
	@Transient
	private List<String> BCP_Critical_Statuses;
	@Transient
	private List<String> shiftTimings;
	@Transient
	private List<String> cTSGrades;
	@Transient
	private List<String> associateBillabilityStatus;
	@Transient
	private List<String> associateAllocToMultProjects;
	@Transient
	private List<String> attritionType;
	@Transient
	private List<Integer> associate_Supervisor_CTS_Ids;
	@Transient
	private List<Integer> associate_Project_Manager_CTS_Ids;
	
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
	 * @return the gPN
	 */
	public Integer getGPIN() {
		return GPIN;
	}
	/**
	 * @param gPN the gPN to set
	 */
	public void setGPIN(Integer GPIN) {
		this.GPIN = GPIN;
	}
	/**
	 * @return the associate_Full_Name
	 */
	public String getAssociate_Full_Name() {
		return associate_Full_Name;
	}
	/**
	 * @param associate_Full_Name the associate_Full_Name to set
	 */
	public void setAssociate_Full_Name(String associate_Full_Name) {
		this.associate_Full_Name = associate_Full_Name;
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
/*	*//**
	 * @return the CTS_DOJ
	 *//*
	public Date getCTS_DOJ() {
		return CTS_DOJ;
	}
	*//**
	 * @param CTS_DOJ the CTS_DOJ to set
	 *//*
	public void setCTS_DOJ(Date CTS_DOJ) {
		this.CTS_DOJ = CTS_DOJ;
	}
	*//**
	 * @return the UBS_Latest_Hire_Date
	 *//*
	public Date getUBS_Latest_Hire_Date() {
		return UBS_Latest_Hire_Date;
	}
	*//**
	 * @param UBS_Latest_Hire_Date the UBS_Latest_Hire_Date to set
	 *//*
	public void setUBS_Latest_Hire_Date(Date UBS_Latest_Hire_Date) {
		this.UBS_Latest_Hire_Date = UBS_Latest_Hire_Date;
	}
*/	/**
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
	 * @return the BCP_Critical_Status
	 */
	public String getBCP_Critical_Status() {
		return BCP_Critical_Status;
	}
	/**
	 * @param BCP_Critical_Status the BCP_Critical_Status to set
	 */
	public void setBCP_Critical_Status(String BCP_Critical_Status) {
		this.BCP_Critical_Status = BCP_Critical_Status;
	}
	/**
	 * @return the seat_Number
	 */
	public String getSeat_Number() {
		return seat_Number;
	}
	/**
	 * @param seat_Number the seat_Number to set
	 */
	public void setSeat_Number(String seat_Number) {
		this.seat_Number = seat_Number;
	}
	/**
	 * @return the shift_Timings
	 */
	public String getShift_Timings() {
		return shift_Timings;
	}
	/**
	 * @param shift_Timings the shift_Timings to set
	 */
	public void setShift_Timings(String shift_Timings) {
		this.shift_Timings = shift_Timings;
	}
	/**
	 * @return the is_It_Shared_Seat
	 *//*
	public String getIs_It_Shared_Seat() {
		return is_It_Shared_Seat;
	}
	*//**
	 * @param is_It_Shared_Seat the is_It_Shared_Seat to set
	 *//*
	public void setIs_It_Shared_Seat(String is_It_Shared_Seat) {
		this.is_It_Shared_Seat = is_It_Shared_Seat;
	}
	*//**
	 * @return the CTS_Grade
	 */
	public String getCTS_Grade() {
		return CTS_Grade;
	}
	/**
	 * @param CTS_Grade the CTS_Grade to set
	 */
	public void setCTS_Grade(String CTS_Grade) {
		this.CTS_Grade = CTS_Grade;
	}
	/**
	 * @return the CTS_Grade_Effective_Date
	 */
/*	public Date getCTS_Grade_Effective_Date() {
		return CTS_Grade_Effective_Date;
	}
	*//**
	 * @param CTS_Grade_Effective_Date the CTS_Grade_Effective_Date to set
	 *//*
	public void setCTS_Grade_Effective_Date(Date CTS_Grade_Effective_Date) {
		this.CTS_Grade_Effective_Date = CTS_Grade_Effective_Date;
	}
*/	/**
	 * @return the associate_Billability_Status
	 */
	public String getAssociate_Billability_Status() {
		return associate_Billability_Status;
	}
	/**
	 * @param associate_Billability_Status the associate_Billability_Status to set
	 */
	public void setAssociate_Billability_Status(String associate_Billability_Status) {
		this.associate_Billability_Status = associate_Billability_Status;
	}
	/**
	 * @return the associate_Billability_Grade
	 */
	public String getAssociate_Billability_Grade() {
		return associate_Billability_Grade;
	}
	/**
	 * @param associate_Billability_Grade the associate_Billability_Grade to set
	 */
	public void setAssociate_Billability_Grade(String associate_Billability_Grade) {
		this.associate_Billability_Grade = associate_Billability_Grade;
	}
	/**
	 * @return the associate_Billability_Rate
	 *//*
	public Long getAssociate_Billability_Rate() {
		return associate_Billability_Rate;
	}
	*//**
	 * @param associate_Billability_Rate the associate_Billability_Rate to set
	 *//*
	public void setAssociate_Billability_Rate(Long associate_Billability_Rate) {
		this.associate_Billability_Rate = associate_Billability_Rate;
	}*/
	/**
	 * @return the associate_Billability_Effective_Date
	 */
/*	public Date getAssociate_Billability_Effective_Date() {
		return associate_Billability_Effective_Date;
	}
	*//**
	 * @param associate_Billability_Effective_Date the associate_Billability_Effective_Date to set
	 *//*
	public void setAssociate_Billability_Effective_Date(
			Date associate_Billability_Effective_Date) {
		this.associate_Billability_Effective_Date = associate_Billability_Effective_Date;
	}
*/	/**
	 * @return the associate_Alloc_to_Mult_Projects
	 */
	public String getAssociate_Alloc_to_Mult_Projects() {
		return associate_Alloc_to_Mult_Projects;
	}
	/**
	 * @param associate_Alloc_to_Mult_Projects the associate_Alloc_to_Mult_Projects to set
	 */
	public void setAssociate_Alloc_to_Mult_Projects(
			String associate_Alloc_to_Mult_Projects) {
		this.associate_Alloc_to_Mult_Projects = associate_Alloc_to_Mult_Projects;
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
	 * @return the block_Leave_From
	 */
	/*public Date getBlock_Leave_From() {
		return block_Leave_From;
	}
	*//**
	 * @param block_Leave_From the block_Leave_From to set
	 *//*
	public void setBlock_Leave_From(Date block_Leave_From) {
		this.block_Leave_From = block_Leave_From;
	}
	*//**
	 * @return the block_Leave_To
	 */
/*	public Date getBlock_Leave_To() {
		return block_Leave_To;
	}
	*//**
	 * @param block_Leave_To the block_Leave_To to set
	 *//*
	public void setBlock_Leave_To(Date block_Leave_To) {
		this.block_Leave_To = block_Leave_To;
	}
*/	/**
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
	 * @return the VDI_Number
	 */
	public String getVDI_Number() {
		return VDI_Number;
	}
	/**
	 * @param VDI_Number the VDI_Number to set
	 */
	public void setVDI_Number(String VDI_Number) {
		this.VDI_Number = VDI_Number;
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
	 * @return the date_of_Relieving
	 */
	public String getDate_of_Relieving() {
		return date_of_Relieving;
	}
	/**
	 * @param date_of_Relieving the date_of_Relieving to set
	 */
	public void setDate_of_Relieving(String date_of_Relieving) {
		this.date_of_Relieving = date_of_Relieving;
	}
	/**
	 * @return the line_Manager_Id
	 */
	public Integer getLine_Manager_Id() {
		return line_Manager_Id;
	}
	/**
	 * @param line_Manager_Id the line_Manager_Id to set
	 */
	public void setLine_Manager_Id(Integer line_Manager_Id) {
		this.line_Manager_Id = line_Manager_Id;
	}
	/**
	 * @return the line_Manager_Name
	 */
	public String getLine_Manager_Name() {
		return line_Manager_Name;
	}
	/**
	 * @param line_Manager_Name the line_Manager_Name to set
	 */
	public void setLine_Manager_Name(String line_Manager_Name) {
		this.line_Manager_Name = line_Manager_Name;
	}
	/**
	 * @return the associate_Supervisor_CTS_Id
	 */
	public Integer getAssociate_Supervisor_CTS_Id() {
		return associate_Supervisor_CTS_Id;
	}
	/**
	 * @param associate_Supervisor_CTS_Id the associate_Supervisor_CTS_Id to set
	 */
	public void setAssociate_Supervisor_CTS_Id(Integer associate_Supervisor_CTS_Id) {
		this.associate_Supervisor_CTS_Id = associate_Supervisor_CTS_Id;
	}
	/**
	 * @return the associate_Supervisor_GPN
	 */
	public Integer getAssociate_Supervisor_GPN() {
		return associate_Supervisor_GPN;
	}
	/**
	 * @param associate_Supervisor_GPN the associate_Supervisor_GPN to set
	 */
	public void setAssociate_Supervisor_GPN(Integer associate_Supervisor_GPN) {
		this.associate_Supervisor_GPN = associate_Supervisor_GPN;
	}
	/**
	 * @return the associate_Supervisor_Name
	 */
	public String getAssociate_Supervisor_Name() {
		return associate_Supervisor_Name;
	}
	/**
	 * @param associate_Supervisor_Name the associate_Supervisor_Name to set
	 */
	public void setAssociate_Supervisor_Name(String associate_Supervisor_Name) {
		this.associate_Supervisor_Name = associate_Supervisor_Name;
	}
	/**
	 * @return the associate_Project_Manager_CTS_Id
	 */
	public Integer getAssociate_Project_Manager_CTS_Id() {
		return associate_Project_Manager_CTS_Id;
	}
	/**
	 * @param associate_Project_Manager_CTS_Id the associate_Project_Manager_CTS_Id to set
	 */
	public void setAssociate_Project_Manager_CTS_Id(
			Integer associate_Project_Manager_CTS_Id) {
		this.associate_Project_Manager_CTS_Id = associate_Project_Manager_CTS_Id;
	}
	/**
	 * @return the associate_Project_Manager_GPN
	 */
	public Integer getAssociate_Project_Manager_GPN() {
		return associate_Project_Manager_GPN;
	}
	/**
	 * @param associate_Project_Manager_GPN the associate_Project_Manager_GPN to set
	 */
	public void setAssociate_Project_Manager_GPN(Integer associate_Project_Manager_GPN) {
		this.associate_Project_Manager_GPN = associate_Project_Manager_GPN;
	}
	/**
	 * @return the associate_Project_Manager_Name
	 */
	public String getAssociate_Project_Manager_Name() {
		return associate_Project_Manager_Name;
	}
	/**
	 * @param associate_Project_Manager_Name the associate_Project_Manager_Name to set
	 */
	public void setAssociate_Project_Manager_Name(
			String associate_Project_Manager_Name) {
		this.associate_Project_Manager_Name = associate_Project_Manager_Name;
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
/*	public Date getUpdated_Date() {
		return updated_Date;
	}
	*//**
	 * @param updated_Date the updated_Date to set
	 *//*
	public void setUpdated_Date(Date updated_Date) {
		this.updated_Date = updated_Date;
	}
*/	/**
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
	 * @return the projectIds
	 */
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
	/**
	 * @return the associateAllocToMultProjects
	 */
	public List<String> getAssociateAllocToMultProjects() {
		return associateAllocToMultProjects;
	}
	/**
	 * @param associateAllocToMultProjects the associateAllocToMultProjects to set
	 */
	public void setAssociateAllocToMultProjects(
			List<String> associateAllocToMultProjects) {
		this.associateAllocToMultProjects = associateAllocToMultProjects;
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
	
}
