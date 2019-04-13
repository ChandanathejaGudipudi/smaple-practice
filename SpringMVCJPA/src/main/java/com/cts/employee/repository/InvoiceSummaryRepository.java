package com.cts.employee.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.InvoiceSummary;
public interface InvoiceSummaryRepository extends JpaRepository<InvoiceSummary, String>{
	public InvoiceSummary findByinvoiceId(String invoiceId);
	@Query("SELECT (project_Name+'*'+processCode+'*'+project_Manager_Code+'*'+account_Manager_Code+'*'+sector_Name+'*'+sub_Sector_Name) FROM ProjectDetails WHERE projectId=?")
	public String checkProjectIT(Integer ProjectId);
	@Query("SELECT account_Id FROM ProjectDetails WHERE projectId=?")
	public Integer checkAccIT(Integer ProjectId);
	
	@Query("SELECT e FROM InvoiceSummary e WHERE e.Project_Id=?")
	public List<InvoiceSummary> findInvoiceSummarybyProjectId(String projectId);

	
	@Query("SELECT e FROM InvoiceSummary e WHERE e.Inv_Year=? and e.Inv_Month=? and  e.Project_Id=?")
	public InvoiceSummary findInvoiceSummarybyDateProjectId(int year,int month,String projectId);
	
	@Query("SELECT e FROM InvoiceSummary e WHERE e.Inv_Month=? and e.Inv_Year=?")
	public List<InvoiceSummary> findInvoiceSummaryByProjectId(int month, int year);
	
}
