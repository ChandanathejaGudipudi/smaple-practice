package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.TaskOrderAllocationDetails;

public interface TaskOrderAllocationDetailsRepository extends JpaRepository<TaskOrderAllocationDetails, String>{
	
	@Query ("select projectId from TaskOrderAllocationDetails where s2cNumber=?")
	public List<Integer> findAllBys2cNumber(String associateCTSIdd);
	
	//public List<String> findAllBys2cNumber(String associateCTSId);
	
	public List<TaskOrderAllocationDetails> findBys2cNumber(String associateCTSId);
}
