package com.cts.employee.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.domain.InvoiceValidation;
import com.cts.employee.domain.Process;
import com.cts.employee.domain.Project;
import com.cts.employee.domain.RevenuePojo;
import com.cts.employee.entity.BCSummary;
import com.cts.employee.entity.InvoiceSummary;
import com.cts.employee.entity.ProcessDetails;
import com.cts.employee.entity.ProjectDetails;
import com.cts.employee.entity.SubSectorDetails;
import com.cts.employee.repository.BCSummaryRepository;
import com.cts.employee.repository.InvoiceSummaryRepository;
import com.cts.employee.repository.ProcessDetailsRepository;
import com.cts.employee.repository.ProjectDetailsRepository;
import com.cts.employee.repository.SubSectorDetailsRepository;
import com.cts.employee.service.RevenueProjectionService;

@Service("revenueProjectionService")
public class RevenueProjectionserviceImpl implements RevenueProjectionService{
	
	@Autowired
	private SubSectorDetailsRepository subSectorDetailsRepository;
	@Autowired
	private ProcessDetailsRepository processDetailsRepository;	
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
	@Autowired
	private BCSummaryRepository bcSummaryRepository;
	
	@Autowired
	private InvoiceSummaryRepository invoiceSummaryRepository;
	
	public List<RevenuePojo> createRevenueVarianceList(String flag,String value){
		System.out.println("searchBy==="+flag+"value=="+value);
		
		List<RevenuePojo>  revenueProjectionList = new LinkedList<RevenuePojo>();
		 if(flag.equals("process")){
			 List<BCSummary> bcSummaryList = bcSummaryRepository.findAllByProcess(value);
			 
			 for(BCSummary bcSummary:bcSummaryList){
				 RevenuePojo revenueProjection = new RevenuePojo();
				 revenueProjection.setProjectId(String.valueOf(bcSummary.getProjectId()));
				 revenueProjection.setProjectName(bcSummary.getProject_Name());
				 revenueProjection.setInvoiceMonth(bcSummary.getBC_Month()+"/"+bcSummary.getBC_Year());
				 revenueProjection.setForcastedValue(String.valueOf(bcSummary.getUSD_Eq_Val()));
				 Double invoiceamount = getInvoiceAmount(bcSummary.getBC_Month(),bcSummary.getBC_Year(),String.valueOf(bcSummary.getProjectId()));
				 if(invoiceamount==0.0){
					 revenueProjection.setActualInvoiceValue("invoice not generated");
					 revenueProjection.setVariance("nil");
				 }else{
					 revenueProjection.setActualInvoiceValue(String.valueOf(invoiceamount));
					 revenueProjection.setVariance(String.valueOf(bcSummary.getUSD_Eq_Val()-invoiceamount));
				 }
				 revenueProjectionList.add(revenueProjection);
			 }
		 }else if(flag.equals("project")){
			 List<BCSummary> bcSummaryList = bcSummaryRepository.findAllByprojectId(Integer.parseInt(value));
			 for(BCSummary bcSummary:bcSummaryList){
				 RevenuePojo revenueProjection = new RevenuePojo();
				 revenueProjection.setProjectId(String.valueOf(bcSummary.getProjectId()));
				 revenueProjection.setProjectName(bcSummary.getProject_Name());
				 revenueProjection.setInvoiceMonth(bcSummary.getBC_Month()+"/"+bcSummary.getBC_Year());
				 revenueProjection.setForcastedValue(String.valueOf(bcSummary.getUSD_Eq_Val()));
				 Double invoiceamount = getInvoiceAmount(bcSummary.getBC_Month(),bcSummary.getBC_Year(),String.valueOf(bcSummary.getProjectId()));
				 if(invoiceamount==0.0){
					 revenueProjection.setActualInvoiceValue("invoice not generated");
					 revenueProjection.setVariance("nil");
				 }else{
					 revenueProjection.setActualInvoiceValue(String.valueOf(invoiceamount));
					 revenueProjection.setVariance(String.valueOf(bcSummary.getUSD_Eq_Val()-invoiceamount));
				 }
				 
				 revenueProjectionList.add(revenueProjection);
			 }
		}
		
		
		
		return revenueProjectionList;
	}
	
	public Map<String,String>  getSubsector(){
		Map<String,String> subsectorMap=new LinkedHashMap<String, String>();
		try{
			List<SubSectorDetails> subSectorDetailsList = subSectorDetailsRepository.findAllListSubSectorDetails();			
			for(SubSectorDetails subSectorDetailsobj : subSectorDetailsList){
				System.out.println(subSectorDetailsobj.getSubSectorCode()+", "+subSectorDetailsobj.getSubSectorName());
				subsectorMap.put(subSectorDetailsobj.getSubSectorCode(), subSectorDetailsobj.getSubSectorName());
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return subsectorMap;
	}

	@Override
	public List<Process> getProcessBySectorID(String sectorid) {
		List<ProcessDetails> processdetailslist = processDetailsRepository.findProcessDetailsBySectorId(sectorid);
		List<Process> processList= new LinkedList<Process>();
		for(ProcessDetails processdetails:processdetailslist){
			
			Process process = new Process();
			process.setProcessid(processdetails.getProcessCode());
			process.setProcessname(processdetails.getProcessName());
			processList.add(process);
		}
		System.out.println("****"+processList);
		return processList;
	}

	@Override
	public List<Project> getProjectByProcessId(String processId) {
		List<ProjectDetails> projectDetailsList = projectDetailsRepository.findAllByProcessCode(processId);
		List<Project> processList= new LinkedList<Project>();
		for(ProjectDetails projectDetails:projectDetailsList){
			Project project= new Project();
			project.setProjectId(String.valueOf(projectDetails.getProjectId()));
			project.setProjectName(projectDetails.getProject_Name());
			processList.add(project);
		}
		return processList;
	}
	
	public Double getInvoiceAmount(int month,int year,String projectId){
		System.out.println(month+"---"+year+"----"+projectId);
		InvoiceSummary invoiceSummary = invoiceSummaryRepository.findInvoiceSummarybyDateProjectId(year,month,projectId);
		
		if(invoiceSummary!=null && invoiceSummary.getUSD_Equ_Pre_Tax()!=null){
			return invoiceSummary.getUSD_Equ_Pre_Tax();
		}else{
			return 0.0 ;
		}	
	}

	
	@Override
	public List<InvoiceValidation>  invoiceValidation(Integer month, Integer year) {
		
		List<InvoiceValidation> listunmatchedInvoiceSummery = new ArrayList<InvoiceValidation>();
		List<BCSummary> bcSummary=bcSummaryRepository.findBcSummaryByProjectId(month,year);
		List<InvoiceSummary> invoiceSummeryList=invoiceSummaryRepository.findInvoiceSummaryByProjectId(month,year);
	
		for(InvoiceSummary m_InvoiceSummary:invoiceSummeryList){
			Boolean isMatched = getunmatchedInvoiceSummary(bcSummary, m_InvoiceSummary);
			if(!isMatched){
				InvoiceValidation invoiceValidation= new InvoiceValidation();
				invoiceValidation.setProcessId(m_InvoiceSummary.getProject_Id());
				invoiceValidation.setProcessName(m_InvoiceSummary.getProcess());
				invoiceValidation.setProcessId(m_InvoiceSummary.getProject_Id());
				invoiceValidation.setProjectname(m_InvoiceSummary.getProject_Desc());
				invoiceValidation.setCostCenter(m_InvoiceSummary.getCost_Centre());
				invoiceValidation.setInvoiceMonth(Integer.toString(m_InvoiceSummary.getInv_Month()));
				invoiceValidation.setInvoiceYear(Integer.toString(m_InvoiceSummary.getInv_Year()));
				invoiceValidation.setInvoiceAmount(Double.toString(m_InvoiceSummary.getUSD_Equ_Post_Tax()));
				invoiceValidation.setStatus("Invoice Not Valid");
				listunmatchedInvoiceSummery.add(invoiceValidation);
			}
		}		
		return listunmatchedInvoiceSummery;
	}

	
	private Boolean  getunmatchedInvoiceSummary(List<BCSummary> bcSummaryList,InvoiceSummary m_InvoiceSummary){
		Boolean isMatched = null;
		for(BCSummary bcSummary:bcSummaryList){
			if (m_InvoiceSummary.getProject_Id().equals(Integer.toString(bcSummary.getProjectId()))
					&& m_InvoiceSummary.getCost_Centre().equals(bcSummary.getCost_center())
					&& m_InvoiceSummary.getS2C_Id().equals(bcSummary.getS2C_Number())
					&& m_InvoiceSummary.getUSD_Equ_Post_Tax() == bcSummary.getUSD_Eq_Val()) {
				isMatched = true;
			}else{
				isMatched = false;
			}
		}
		return isMatched;
	}

	@Override
	public List<RevenuePojo> createRevenueProjectionList(String flag, String value) {		
		List<RevenuePojo>  revenueProjectionList = new LinkedList<RevenuePojo>();
		 if(flag.equals("process")){
			 List<BCSummary> bcSummaryList = bcSummaryRepository.findAllByProcess(value);
			 
			 for(BCSummary bcSummary:bcSummaryList){
				 RevenuePojo revenueProjection = new RevenuePojo();
				 revenueProjection.setProjectId(String.valueOf(bcSummary.getProjectId()));
				 revenueProjection.setProjectName(bcSummary.getProject_Name());
				 revenueProjection.setInvoiceMonth(String.valueOf(bcSummary.getBC_Month()));
				 revenueProjection.setInvoiceYear(String.valueOf(bcSummary.getBC_Year()));
				 revenueProjection.setForcastedValue(String.valueOf(bcSummary.getUSD_Eq_Val()));
				 revenueProjectionList.add(revenueProjection);
			 }
		 }else if(flag.equals("project"))
		 {
			 List<BCSummary> bcSummaryList = bcSummaryRepository.findAllByprojectId(Integer.parseInt(value));
			 for(BCSummary bcSummary:bcSummaryList){
				 RevenuePojo revenueProjection = new RevenuePojo();
				 revenueProjection.setProjectId(String.valueOf(bcSummary.getProjectId()));
				 revenueProjection.setProjectName(bcSummary.getProject_Name());
				 revenueProjection.setInvoiceMonth(String.valueOf(bcSummary.getBC_Month()));
				 revenueProjection.setInvoiceYear(String.valueOf(bcSummary.getBC_Year()));
				 revenueProjection.setForcastedValue(String.valueOf(bcSummary.getUSD_Eq_Val()));
				 revenueProjectionList.add(revenueProjection);
			 }
		 }
		 
		 return revenueProjectionList;
	}
	
	
	
}
