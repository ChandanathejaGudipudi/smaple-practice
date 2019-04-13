package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AccountDetails;
import com.cts.employee.entity.AssociateTransportAllowance;

public interface AssociateTransportAllowanceRepository extends JpaRepository<AssociateTransportAllowance, Integer>{
	
	@Query (value="select distinct associateId from AssociateTransportAllowance")
	public List<AssociateTransportAllowance> findDistinctByAssoicatesIds();

}
