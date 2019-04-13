package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.ProcessDetails;

public interface ProcessDetailsRepository extends JpaRepository<ProcessDetails, String>{

	public ProcessDetails findAllByProcessCode(String processCode);
	
	@Query("SELECT e FROM ProcessDetails e WHERE e.sub_Sector_Code=?")
	public List<ProcessDetails> findProcessDetailsBySectorId(String sectorId);
}
