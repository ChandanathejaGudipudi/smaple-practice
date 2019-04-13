package com.cts.employee.service;

import java.util.List;
import java.util.Map;

import com.cts.employee.domain.InvoiceValidation;
import com.cts.employee.domain.Process;
import com.cts.employee.domain.Project;
import com.cts.employee.domain.RevenuePojo;


public interface RevenueProjectionService {
	
	
	public List<RevenuePojo> createRevenueVarianceList(String flag,String value);
	public List<RevenuePojo> createRevenueProjectionList(String flag,String value);
	public Map<String,String>  getSubsector();
	public List <Process> getProcessBySectorID(String sectorid);
	public List <Project> getProjectByProcessId(String processId);
	public List<InvoiceValidation> invoiceValidation(Integer month,Integer year);
	

}
