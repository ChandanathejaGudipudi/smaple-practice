package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.ProjectDetails;

public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Integer>{

	@Query ("SELECT projectId FROM ProjectDetails")
	public List<Integer> findAllProjectIds();
	
	public List<ProjectDetails> findAllByProcessCode(String processCode);
	
}
