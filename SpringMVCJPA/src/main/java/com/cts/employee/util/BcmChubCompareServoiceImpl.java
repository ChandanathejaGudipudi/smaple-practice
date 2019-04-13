package com.cts.employee.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.entity.AssociateAllocationDetails;
import com.cts.employee.entity.AssociateSummary;
import com.cts.employee.entity.ESAdump;
import com.cts.employee.repository.AssociateAllocationDetailsRepository;
import com.cts.employee.repository.AssociateSummaryRepository;
import com.cts.employee.repository.ESADetailsRepository;
import com.cts.employee.service.BcmChubCompareServoice;

@Service("BcmChubCompareServoice")
public class BcmChubCompareServoiceImpl implements BcmChubCompareServoice {

	@Autowired
	private ESADetailsRepository c_ESADetailsRepository;
	
	@Autowired
	private AssociateAllocationDetailsRepository c_AssociateAllocationDetailsRepository;
	
	@Autowired
	private AssociateSummaryRepository c_AssociateSummaryRepository;
	
	@Override
	public String getBcmChubAssociateSummery(String projectId) {
		
		Integer project_Id=Integer.parseInt(projectId);
		List<ESAdump> m_ESADumpList = c_ESADetailsRepository.findAllByprojectId(project_Id);
		List<ESAdump> billable_ESADumpList = new ArrayList<ESAdump>();
		List<ESAdump> non_ESADumpList = new ArrayList<ESAdump>();
		List<ESAdump> alloca_ESADumpList = new ArrayList<ESAdump>();
		List<ESAdump> nonalloca_ESADumpList = new ArrayList<ESAdump>();
		
		
		for(ESAdump obb : m_ESADumpList){
			if("Billable".equals(obb.getBillabilityStatus())){
				billable_ESADumpList.add(obb);
			}else{
				non_ESADumpList.add(obb);
			}
			
		}
		
		for(ESAdump obb : m_ESADumpList){
			if(100==obb.getAlloc_Percent()){
				alloca_ESADumpList.add(obb);
			}else{
				nonalloca_ESADumpList.add(obb);
			}
			
		}
		
		
		
		
		
		List billable=new ArrayList();
		List nonBillabnle=new ArrayList();
		List<AssociateSummary>  listAssociateSummery = c_AssociateSummaryRepository.findAllByProjectId(project_Id);
		
		for(AssociateSummary ooc : listAssociateSummery){
			if("Billable".equals(ooc.getBillability_Status())){
				billable.add(ooc);
			}else{
				nonBillabnle.add(ooc);
			}
			
		}
		
		
		List allocatation=new ArrayList();
		List lessllocatation=new ArrayList();
		List<AssociateAllocationDetails> listAssociateAllocationDetails=c_AssociateAllocationDetailsRepository.findAssociateAllocationDetailsByProjectId(project_Id);
		
		for(AssociateAllocationDetails ooa:listAssociateAllocationDetails){
			if(100==ooa.getAllocation_Percentage()){
				allocatation.add(ooa);
			}else{
				lessllocatation.add(ooa);
			}
			
		}
		
		System.out.println("************CHUB***************************");
		System.out.println("TOTAL NO OF BILLABLE"+billable.size());
		System.out.println("TOTAL NO OF NON BILLABLE"+nonBillabnle.size());
		System.out.println("TOTAL NO OF 100 % allacatation"+allocatation.size());
		System.out.println("TOTAL NO OF less than 100 % BILLABLE"+lessllocatation.size());
		
		
		System.out.println("************ESA***************************");
		System.out.println("TOTAL NO OF BILLABLE"+billable_ESADumpList.size());
		System.out.println("TOTAL NO OF NON BILLABLE"+non_ESADumpList.size());
		System.out.println("TOTAL NO OF 100 % allacatation"+alloca_ESADumpList.size());
		System.out.println("TOTAL NO OF less than 100 % BILLABLE"+nonalloca_ESADumpList.size());
		
		
		String result="<table br=1>"				
				+ "<tr><td>DEPARTMENT</td><td>BILLABLE</td><td>NON BILLABLE</td><td>100 % Allocated</td><td>Less Than 100 % Allocated</td></tr>"
				+ "<tr><td>CHUB</td><td>"+billable.size()+"</td><td>"+nonBillabnle.size()+"</td><td>"+allocatation.size()+"</td><td>"+lessllocatation.size()+"</td></tr>"			
				+ "<tr><td>ESA</td><td>"+billable_ESADumpList.size()+"</td><td>"+non_ESADumpList.size()+"</td><td>"+alloca_ESADumpList.size()+"</td><td>"+nonalloca_ESADumpList.size()+"</td></tr>"				
				+ "</table>";
		
		return result;
	}

}
