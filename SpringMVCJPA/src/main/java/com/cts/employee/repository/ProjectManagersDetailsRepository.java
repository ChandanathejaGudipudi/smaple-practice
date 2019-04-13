package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.ProjectManagersDetails;

public interface ProjectManagersDetailsRepository extends JpaRepository<ProjectManagersDetails, String>{

	@Query ("SELECT projectManagerCTSId FROM ProjectManagersDetails")
	public List<Integer> findAllProjectManagerCtsIds();
	
	public List<ProjectManagersDetails> findDistinctByProjectManagerCTSId(Integer projectManagerCTSId);

//	public ProjectManagersDetails findByProjectId(int projectId);
	
	@Query (value="select distinct project_Manager_Name from ProjectManagersDetails")
	public List<ProjectManagersDetails> findDistinctByProjectManagerCTSId();
}
