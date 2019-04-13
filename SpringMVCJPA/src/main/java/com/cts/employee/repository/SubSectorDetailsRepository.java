package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.SubSectorDetails;

public interface SubSectorDetailsRepository extends JpaRepository<SubSectorDetails, Integer>{
	
	
	@Query("SELECT e FROM SubSectorDetails e ")
	public List<SubSectorDetails> findAllListSubSectorDetails();
}
