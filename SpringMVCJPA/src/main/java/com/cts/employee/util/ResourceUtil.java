package com.cts.employee.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.cts.employee.entity.AssociateSummary;
import com.cts.employee.entity.ProjectDetails;
import com.cts.employee.repository.AccountDetailsRepository;
import com.cts.employee.repository.AccountManagerDetailsRepository;
import com.cts.employee.repository.CtsGradeRepository;
import com.cts.employee.repository.DeliveryLeadDetailsRepository;
import com.cts.employee.repository.ProcessDetailsRepository;
import com.cts.employee.repository.ProcessOwnerDetailsRepository;
import com.cts.employee.repository.ProjectDetailsRepository;
import com.cts.employee.repository.ProjectManagersDetailsRepository;
import com.cts.employee.repository.RegionDetailsRepository;
import com.cts.employee.repository.ShiftTimingsRepository;
import com.cts.employee.repository.SubProcessDetailsRepository;
import com.cts.employee.repository.TeamDetailsRepository;

@Component
@Qualifier ("util")
public class ResourceUtil {
	
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
	
	@Autowired
	private ShiftTimingsRepository shiftTimingsRepository;
	
	@Autowired
	private CtsGradeRepository ctsGradeRepository;
	
	@Autowired
	private ProcessDetailsRepository processDetailsRepository;
	
	@Autowired
	private SubProcessDetailsRepository subProcessDetailsRepository;
	
	@Autowired
	private TeamDetailsRepository teamDetailsRepository;
	
	@Autowired
	private RegionDetailsRepository regionDetailsRepository;
	
	@Autowired
	private DeliveryLeadDetailsRepository deliveryLeadDetailsRepository;
	
	@Autowired
	private ProjectManagersDetailsRepository projectManagersDetailsRepository;
	
	@Autowired
	private ProcessOwnerDetailsRepository processOwnerDetailsRepository;
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
	@Autowired
	private AccountManagerDetailsRepository accountManagerDetailsRepository;
	
	public AssociateSummary loadForm(AssociateSummary as){
		
		as.setProjectIds(projectDetailsRepository.findAllProjectIds());
		
		List<String> associateStatus = new ArrayList<String>();
		associateStatus.add("Active");
		associateStatus.add("In_Active");
		as.setAssociateStatus(associateStatus);
		
		List<String> associateBillabilityStatus = new ArrayList<String>();
		associateBillabilityStatus.add("Billable");
		associateBillabilityStatus.add("Non-billable");
		as.setAssociateBillabilityStatus(associateBillabilityStatus);
		
		List<String> associateBillabilityGrade = new ArrayList<String>();
		associateBillabilityGrade.add("L1");
		associateBillabilityGrade.add("L2");
		associateBillabilityGrade.add("L3");
		as.setAssociateBillabilityGrade(associateBillabilityGrade);
		
		List<String> bCP_Critical_Statuses = new ArrayList<String>();
		bCP_Critical_Statuses.add("Critical");
		bCP_Critical_Statuses.add("Non-Critical");
		as.setBCP_Critical_Statuses(bCP_Critical_Statuses);
		
		as.setShiftTimings(shiftTimingsRepository.findAllShiftTimings());
		as.setcTSGrades(ctsGradeRepository.findAllCtsGrades());
		
		List<String> attritionType = new ArrayList<String>();
		attritionType.add("Voluntary");
		attritionType.add("Involuntary");
		as.setAttritionType(attritionType);
		
		List<String> associateMovemntType = new ArrayList<String>();
		associateMovemntType.add("Internal Movement with in UBS");
		associateMovemntType.add("Attrition");
		associateMovemntType.add("Moved to CTS");
		as.setAssociateMovemntType(associateMovemntType);
		
		if(!StringUtils.isEmpty(as.getAssociateCTSId())){
			as.setProcess(processDetailsRepository.findOne(as.getProcess_Code()).getProcessName());
			as.setSub_Process(subProcessDetailsRepository.findOne(as.getSub_Process_Code()).getSubProcessName());
			/*as.setTeam(teamDetailsRepository.findOne(as.getTeam_Code()).getTeamName());
			as.setCTS_Grade(ctsGradeRepository.findOne(as.getCTS_Grade_Code()).getcTSGrade());
			as.setRegion(regionDetailsRepository.findOne(as.getRegion_Code()).getRegionName());*/
		}
//		as.setAssociate_Project_Manager_CTS_Ids(projectManagersDetailsRepository.findAllProjectManagerCtsIds());
		

		return as;
	}
	
	public ProjectDetails loadForm(ProjectDetails pd){
		
		//pd.setProjectIds(projectDetailsRepository.findAllProjectIds());
		
		List<String> projectBillableStatus = new ArrayList<String>();
		projectBillableStatus.add("BTM"); 
		projectBillableStatus.add("BFD");
		projectBillableStatus.add("BTB");
		projectBillableStatus.add("NBL");
		pd.setProjectBillableStatus(projectBillableStatus);
		
		List<String> activeStatus = new ArrayList<String>();
		activeStatus.add("Active");
		activeStatus.add("In_Active");
		pd.setActiveStatus(activeStatus);
		
		pd.setProjectManagers(projectManagersDetailsRepository.findAll());
		pd.setProcessOwners(processOwnerDetailsRepository.findAll());
		pd.setDeliveryLeads(deliveryLeadDetailsRepository.findAll());
		pd.setAccountManagers(accountManagerDetailsRepository.findAll());
		pd.setAccountIds(accountDetailsRepository.findAll());
		
		/*pd.setProjectManagerCtsIds(projectManagersDetailsRepository.findDistinctByProjectManagerCTSId());
		pd.setProcessOwnerCTSId(processOwnerDetailsRepository.findDistinctByProcessOwnerCTSId());
		pd.setDeliveryLeadCTSId(deliveryLeadDetailsRepository.findDistinctByDeliveryLeadCTSId());
		pd.setAccountManagerCTSId(accountManagerDetailsRepository.findDistinctByAccountManagerCTSId());
		pd.setAccountIds(accountDetailsRepository.findDistinctByaccountIds());
		*/
		/*
		project.setProject_Manager_Name(projectManagersDetailsRepository.findByProjectId(
				project.getProjectId()).getProject_Manager_Name());
		project.setDelivery_Lead_CTS_Id(deliveryLeadDetailsRepository.findOne(
				project.getDelivery_Lead_Code()).getDelivery_Lead_CTS_Id());
		project.setDelivery_Lead_Name(deliveryLeadDetailsRepository.findOne(
				project.getDelivery_Lead_Code()).getDelivery_Lead_Name());
		project.setAccount_Name(accountDetailsRepository.findOne(
				project.getAccount_Id()).getAccountName());
		AccountManagerDetails am= accountManagerDetailsRepository.findByAccountId(project.getAccount_Id()); 
		if(null != am){
		project.setAccount_Manager_CTS_Id(am.getAccount_Manager_CTS_Id());
		project.setAccount_Manager_Name(am.getAccount_Manager_Name());
		}
		
		pd.setprojectManager_CTSId(projectManager_CTSId);
		pd.setProcessOwnerCTSId(processOwnerCTSId);
		pd.setDeliveryLeadCTSId(deliveryLeadCTSId);
		pd.setAccountManagerCTSId(accountManagerCTSId);
		pd.setAccountIds(accountIds);
		*/
		return pd;
	}

}
