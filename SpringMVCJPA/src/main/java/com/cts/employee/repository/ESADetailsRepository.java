package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cts.employee.entity.ESAdump;

public interface ESADetailsRepository extends JpaRepository<ESAdump, Integer>{
	
	
	@Query("SELECT e FROM ESAdump e WHERE e.projectId=?")
	public List<ESAdump> findAllByprojectId(int projectid);
	
}