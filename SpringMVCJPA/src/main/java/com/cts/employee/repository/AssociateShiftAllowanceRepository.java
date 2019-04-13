package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AccountDetails;
import com.cts.employee.entity.AssociateShiftAllowance;

public interface AssociateShiftAllowanceRepository extends JpaRepository<AssociateShiftAllowance, Integer>{
	
	@Query (value="select distinct allowanceId from AssociateShiftAllowance")
	public List<AssociateShiftAllowance> findDistinctByaccountIds();
	
	@Query ("select allowanceId from AssociateShiftAllowance")
	public List<Integer> findAllAssociates();


}
