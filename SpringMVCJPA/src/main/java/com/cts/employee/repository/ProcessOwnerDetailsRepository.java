package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.ProcessOwnerDetails;

public interface ProcessOwnerDetailsRepository extends JpaRepository<ProcessOwnerDetails, String>{
	
	public ProcessOwnerDetails findByProcessOwnerCTSId(Integer process_Owner_CTS_Id);

	@Query (value="select distinct process_Owner_Name from ProcessOwnerDetails")
	public List<ProcessOwnerDetails> findDistinctByProcessOwnerCTSId();
}
