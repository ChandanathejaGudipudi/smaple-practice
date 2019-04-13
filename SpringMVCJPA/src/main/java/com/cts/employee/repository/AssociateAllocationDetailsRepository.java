package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AssociateAllocationDetails;

public interface AssociateAllocationDetailsRepository extends JpaRepository<AssociateAllocationDetails, Integer>{
	
	@Query ("select projectId from AssociateAllocationDetails where associateCTSId=?")
	public List<Integer> findAllByAssociateCTSId(Integer associateCTSId);

	public List<AssociateAllocationDetails> findByAssociateCTSId(Integer associateCTSId);
	
	public AssociateAllocationDetails findByAssociateCTSIdAndProjectId(Integer associateCTSId,
			Integer projectId);
	
	@Query("SELECT DISTINCT process FROM AssociateAllocationDetails p WHERE p.associateCTSId=?")
	public List<String> findByAssociateCTSIdNoDuplicates(Integer associateCTSId);
	
	@Query("SELECT e FROM AssociateAllocationDetails e WHERE e.projectId=?")
	public List<AssociateAllocationDetails> findAssociateAllocationDetailsByProjectId(Integer projectId);
	
}
