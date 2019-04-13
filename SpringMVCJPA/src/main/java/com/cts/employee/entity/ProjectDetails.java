package com.cts.employee.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_project_details")
public class ProjectDetails {
	
	@Id
    @Basic(optional = false)
	@Column (name="PROJECT_ID")
	private Integer projectId;
	private String project_Name;
	private String project_Billable_Status;
	private String project_Manager_Code;
	@Transient
	private Integer projectManagerCTSId;
	@Transient
	private String project_Manager_Name;
	//private String project_Status;
	private Integer account_Id;
	//private String region;
	@Transient
	private String account_Name;
	@Column (name="process_Code")
	private String processCode;
	@Transient
	private String processName;
	private String sector_Name;
	private String sub_Sector_Name;
	private String ubs_Segment_Name;
	private String ubs_Service_Line_Name;
	private String account_Manager_Code;
	@Transient
	private Integer account_Manager_CTS_Id;
	@Transient
	private String account_Manager_Name;
	private String process_Owner_Code;
	@Transient
	private Integer process_Owner_CTS_Id;
	@Transient
	private String process_Owner_Name;
	private String delivery_Lead_Code;
	@Transient
	private Integer delivery_Lead_CTS_Id;
	@Transient
	private String delivery_Lead_Name;
	private String effective_Date;
	private String expiry_Date;
	private String active_Status;
	private Integer updated_By;
	private String updated_Date;
	@Transient
	private String ctsId;
	@Transient
	private List<String> projectBillableStatus;
	@Transient
	private List<String> activeStatus;
	@Transient
	private List<AccountDetails> accountIds;
	@Transient
	private List<AccountManagerDetails> accountManagers;
	@Transient
	private List<ProcessOwnerDetails> processOwners;	
	@Transient
	private List<DeliveryLeadDetails> deliveryLeads;
	@Transient
	private List<ProjectManagersDetails> projectManagers;
	@Transient
	private List<ProcessDetails> processNames;
	@Transient
	private List<SectorDetails> sectorNames;
	@Transient
	private List<SubSectorDetails> subSectorNames;
	@Transient
	private List<ServiceLineDeatails> serviceLineNames;
	@Transient
	private List<SegmentDetails> segmentNames;
	
	

	
	/**
	 * @return the serviceLineNames
	 */
	public List<ServiceLineDeatails> getServiceLineNames() {
		return serviceLineNames;
	}

	/**
	 * @param serviceLineNames the serviceLineNames to set
	 */
	public void setServiceLineNames(List<ServiceLineDeatails> serviceLineNames) {
		this.serviceLineNames = serviceLineNames;
	}

	/**
	 * @return the segmentNames
	 */
	public List<SegmentDetails> getSegmentNames() {
		return segmentNames;
	}

	/**
	 * @param segmentNames the segmentNames to set
	 */
	public void setSegmentNames(List<SegmentDetails> segmentNames) {
		this.segmentNames = segmentNames;
	}

	/**
	 * @return the accountManagers
	 */
	public List<AccountManagerDetails> getAccountManagers() {
		return accountManagers;
	}

	/**
	 * @param accountManagers the accountManagers to set
	 */
	public void setAccountManagers(List<AccountManagerDetails> accountManagers) {
		this.accountManagers = accountManagers;
	}

	/**
	 * @return the processOwners
	 */
	public List<ProcessOwnerDetails> getProcessOwners() {
		return processOwners;
	}

	/**
	 * @param processOwners the processOwners to set
	 */
	public void setProcessOwners(List<ProcessOwnerDetails> processOwners) {
		this.processOwners = processOwners;
	}

	/**
	 * @return the deliveryLeads
	 */
	public List<DeliveryLeadDetails> getDeliveryLeads() {
		return deliveryLeads;
	}

	/**
	 * @param deliveryLeads the deliveryLeads to set
	 */
	public void setDeliveryLeads(List<DeliveryLeadDetails> deliveryLeads) {
		this.deliveryLeads = deliveryLeads;
	}

	/**
	 * @return the projectManagers
	 */
	public List<ProjectManagersDetails> getProjectManagers() {
		return projectManagers;
	}

	/**
	 * @param projectManagers the projectManagers to set
	 */
	public void setProjectManagers(List<ProjectManagersDetails> projectManagers) {
		this.projectManagers = projectManagers;
	}

	

	/**
	 * @return the accountIds
	 */
	public List<AccountDetails> getAccountIds() {
		return accountIds;
	}

	/**
	 * @param accountIds the accountIds to set
	 */
	public void setAccountIds(List<AccountDetails> accountIds) {
		this.accountIds = accountIds;
	}

	
	/**
	 * @param projectManagerCTSId the projectManagerCTSId to set
	 */
	public void setProjectManagerCTSId(Integer projectManagerCTSId) {
		this.projectManagerCTSId = projectManagerCTSId;
	}
	
	public List<String> getProjectBillableStatus() {
		return projectBillableStatus;
	}
	
	public void setProjectBillableStatus(List<String> projectBillableStatus) {
		this.projectBillableStatus = projectBillableStatus;
	}
	
	public List<String> getActiveStatus() {
		return activeStatus;
	}
	
	public void setActiveStatus(List<String> activeStatus) {
		this.activeStatus = activeStatus;
	}
	/**
	 * @return the processNames
	 */
	public List<ProcessDetails> getProcessNames() {
		return processNames;
	}

	/**
	 * @param processNames the processNames to set
	 */
	public void setProcessNames(List<ProcessDetails> processNames) {
		this.processNames = processNames;
	}

	/**
	 * @return the sectorNames
	 */
	public List<SectorDetails> getSectorNames() {
		return sectorNames;
	}

	/**
	 * @param sectorNames the sectorNames to set
	 */
	public void setSectorNames(List<SectorDetails> sectorNames) {
		this.sectorNames = sectorNames;
	}

	/**
	 * @return the subSectorNames
	 */
	public List<SubSectorDetails> getSubSectorNames() {
		return subSectorNames;
	}

	/**
	 * @param subSectorNames the subSectorNames to set
	 */
	public void setSubSectorNames(List<SubSectorDetails> subSectorNames) {
		this.subSectorNames = subSectorNames;
	}

	/**
	 * @return the account_Id
	 */
	public Integer getAccount_Id() {
		return account_Id;
	}

	/**
	 * @param account_Id the account_Id to set
	 */
	public void setAccount_Id(Integer account_Id) {
		this.account_Id = account_Id;
	}

	/**
	 * @return the accountIds
	 */
	

	
		
	/**
	 * @return the projectManagerCTSId
	 */
	public Integer getProjectManagerCTSId() {
		return projectManagerCTSId;
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
	 * @return the account_Name
	 */
	public String getAccount_Name() {
		return account_Name;
	}
	/**
	 * @param account_Name the account_Name to set
	 */
	public void setAccount_Name(String account_Name) {
		this.account_Name = account_Name;
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
	 * @return the sector_Name
	 */
	public String getSector_Name() {
		return sector_Name;
	}

	/**
	 * @param sector_Name the sector_Name to set
	 */
	public void setSector_Name(String sector_Name) {
		this.sector_Name = sector_Name;
	}

	/**
	 * @return the sub_Sector_Name
	 */
	public String getSub_Sector_Name() {
		return sub_Sector_Name;
	}

	/**
	 * @param sub_Sector_Name the sub_Sector_Name to set
	 */
	public void setSub_Sector_Name(String sub_Sector_Name) {
		this.sub_Sector_Name = sub_Sector_Name;
	}

	/**
	 * @param project_Name the project_Name to set
	 */
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	/**
	 * @return the processCode
	 */
	public String getProcessCode() {
		return processCode;
	}
	/**
	 * @param processCode the processCode to set
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	/**
	 * @return the account_Manager_Code
	 */
	public String getAccount_Manager_Code() {
		return account_Manager_Code;
	}
	/**
	 * @param account_Manager_Code the account_Manager_Code to set
	 */
	public void setAccount_Manager_Code(String account_Manager_Code) {
		this.account_Manager_Code = account_Manager_Code;
	}
	/**
	 * @return the process_Owner_Code
	 */
	public String getProcess_Owner_Code() {
		return process_Owner_Code;
	}
	/**
	 * @param process_Owner_Code the process_Owner_Code to set
	 */
	public void setProcess_Owner_Code(String process_Owner_Code) {
		this.process_Owner_Code = process_Owner_Code;
	}
	/**
	 * @return the delivery_Lead_Code
	 */
	public String getDelivery_Lead_Code() {
		return delivery_Lead_Code;
	}
	/**
	 * @param delivery_Lead_Code the delivery_Lead_Code to set
	 */
	public void setDelivery_Lead_Code(String delivery_Lead_Code) {
		this.delivery_Lead_Code = delivery_Lead_Code;
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
	 * @return the effective_Date
	 */
	public String getEffective_Date() {
		return effective_Date;
	}

	/**
	 * @param effective_Date the effective_Date to set
	 */
	public void setEffective_Date(String effective_Date) {
		this.effective_Date = effective_Date;
	}

	/**
	 * @return the expiry_Date
	 */
	public String getExpiry_Date() {
		return expiry_Date;
	}

	/**
	 * @param expiry_Date the expiry_Date to set
	 */
	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
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

	/*public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}*/
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * @return the account_Manager_CTS_Id
	 */
	public Integer getAccount_Manager_CTS_Id() {
		return account_Manager_CTS_Id;
	}
	/**
	 * @param account_Manager_CTS_Id the account_Manager_CTS_Id to set
	 */
	public void setAccount_Manager_CTS_Id(Integer account_Manager_CTS_Id) {
		this.account_Manager_CTS_Id = account_Manager_CTS_Id;
	}
	/**
	 * @return the account_Manager_Name
	 */
	public String getAccount_Manager_Name() {
		return account_Manager_Name;
	}
	/**
	 * @param account_Manager_Name the account_Manager_Name to set
	 */
	public void setAccount_Manager_Name(String account_Manager_Name) {
		this.account_Manager_Name = account_Manager_Name;
	}
	/**
	 * @return the process_Owner_CTS_Id
	 */
	public Integer getProcess_Owner_CTS_Id() {
		return process_Owner_CTS_Id;
	}
	/**
	 * @param process_Owner_CTS_Id the process_Owner_CTS_Id to set
	 */
	public void setProcess_Owner_CTS_Id(Integer process_Owner_CTS_Id) {
		this.process_Owner_CTS_Id = process_Owner_CTS_Id;
	}
	/**
	 * @return the process_Owner_Name
	 */
	public String getProcess_Owner_Name() {
		return process_Owner_Name;
	}
	/**
	 * @param process_Owner_Name the process_Owner_Name to set
	 */
	public void setProcess_Owner_Name(String process_Owner_Name) {
		this.process_Owner_Name = process_Owner_Name;
	}
	/**
	 * @return the delivery_Lead_CTS_Id
	 */
	public Integer getDelivery_Lead_CTS_Id() {
		return delivery_Lead_CTS_Id;
	}
	/**
	 * @param delivery_Lead_CTS_Id the delivery_Lead_CTS_Id to set
	 */
	public void setDelivery_Lead_CTS_Id(Integer delivery_Lead_CTS_Id) {
		this.delivery_Lead_CTS_Id = delivery_Lead_CTS_Id;
	}
	/**
	 * @return the delivery_Lead_Name
	 */
	public String getDelivery_Lead_Name() {
		return delivery_Lead_Name;
	}
	/**
	 * @param delivery_Lead_Name the delivery_Lead_Name to set
	 */
	public void setDelivery_Lead_Name(String delivery_Lead_Name) {
		this.delivery_Lead_Name = delivery_Lead_Name;
	}
	public String getProject_Billable_Status() {
		return project_Billable_Status;
	}
	public void setProject_Billable_Status(String project_Billable_Status) {
		this.project_Billable_Status = project_Billable_Status;
	}

	public String getProject_Manager_Code() {
		return project_Manager_Code;
	}

	public void setProject_Manager_Code(String project_Manager_Code) {
		this.project_Manager_Code = project_Manager_Code;
	}

	/**
	 * @return the ctsId
	 */
	public String getCtsId() {
		return ctsId;
	}

	/**
	 * @param ctsId the ctsId to set
	 */
	public void setCtsId(String ctsId) {
		this.ctsId = ctsId;
	}

	/**
	 * @return the ubs_Segment_Name
	 */
	public String getUbs_Segment_Name() {
		return ubs_Segment_Name;
	}

	/**
	 * @param ubs_Segment_Name the ubs_Segment_Name to set
	 */
	public void setUbs_Segment_Name(String ubs_Segment_Name) {
		this.ubs_Segment_Name = ubs_Segment_Name;
	}

	/**
	 * @return the ubs_Service_Line_Name
	 */
	public String getUbs_Service_Line_Name() {
		return ubs_Service_Line_Name;
	}

	/**
	 * @param ubs_Service_Line_Name the ubs_Service_Line_Name to set
	 */
	public void setUbs_Service_Line_Name(String ubs_Service_Line_Name) {
		this.ubs_Service_Line_Name = ubs_Service_Line_Name;
	}
	
	
}
