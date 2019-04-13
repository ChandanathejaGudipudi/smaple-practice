package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AccountManagerDetails;

public interface AccountManagerDetailsRepository extends JpaRepository<AccountManagerDetails, String>{
	public AccountManagerDetails findByAccountId(int accountId);
	
	@Query (value="select distinct account_Manager_Name from AccountManagerDetails")
	public List<AccountManagerDetails> findDistinctByAccountManagerCTSId();
	
	public AccountManagerDetails findByAccountManagerCTSId(Integer account_Manager_CTS_Id);

}
