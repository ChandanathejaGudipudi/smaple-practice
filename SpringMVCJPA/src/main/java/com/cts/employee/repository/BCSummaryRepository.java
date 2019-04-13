package com.cts.employee.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.entity.BCSummary;
public interface BCSummaryRepository extends JpaRepository<BCSummary, Integer>{
	public BCSummary findBybCId(int BC_Id);
	@Query("SELECT s2cNumber FROM TOSummary WHERE s2cNumber=? and Parent_TO=?")
	public String checkParentTO(String S2C_Number, String Parent_TO);
	@Query("SELECT (Project_Name+'*'+Process) FROM TaskOrderAllocationDetails WHERE s2cNumber=? and projectId=?")
	public String checkProjectTO(String S2C_Number, Integer ProjectId);
	@Query("SELECT max(bCId) FROM BCSummary")
	public String getSeq();
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("DELETE FROM BCSummary WHERE bCId=?")
	public void delBC(int BC_Id);
	
	
	@Query("SELECT e FROM BCSummary e WHERE e.Process=?")
	public List<BCSummary> findAllByProcess(String process);
	
	@Query("SELECT e FROM BCSummary e WHERE e.ProjectId=?")
	public List<BCSummary> findAllByprojectId(int projectid);
	
	
	@Query("SELECT e FROM BCSummary e WHERE e.BC_Year=? and e.BC_Month=? and  e.ProjectId=?")
	public BCSummary findInvoiceSummarybyDateProjectId(int year,int month,int projectId);
	
	@Query("SELECT e FROM BCSummary e WHERE e.BC_Year=? and e.BC_Month=? and  e.ProjectId=? and e.S2C_Number=?")
	public BCSummary findInvoiceSummarybyDateProjectIdS2C_Number(int year,int month,int projectId,String S2C_Number);
	
	@Query("SELECT e FROM BCSummary e WHERE e.BC_Month=? and e.BC_Year=?")
	public List<BCSummary> findBcSummaryByProjectId(int montyh, int year);
	
}
