package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AssociateSummary;
import com.cts.employee.entity.SubSectorDetails;
import com.cts.employee.entity.TOSummary;

public interface TOSummaryRepository extends JpaRepository<TOSummary, String>{
	public TOSummary findBys2cNumber(String S2C_Number);
	
	@Query ("select Task_Type from TOSummary where s2cNumber=?")
	public String finds2cNumber_CCN(String S2C_Number);
	
	@Query ("select Parent_TO from TOSummary where s2cNumber=?")
	public String finds2cNumber_TO(String S2C_Number);
	
	
	@Query("SELECT e FROM TOSummary e ")
	public List<TOSummary> findAllTOSummaryDetails();
	
}
