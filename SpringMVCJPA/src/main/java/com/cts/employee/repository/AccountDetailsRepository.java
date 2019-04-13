package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>{
	
	@Query (value="select distinct accountName from AccountDetails")
	public List<AccountDetails> findDistinctByaccountIds();

}
