package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.DeliveryLeadDetails;

public interface DeliveryLeadDetailsRepository extends JpaRepository<DeliveryLeadDetails, String>{
	
	public DeliveryLeadDetails findByDeliveryLeadCTSId(Integer deliveryLeadCTSId);

	@Query (value="select distinct delivery_Lead_Name from DeliveryLeadDetails")
	public List<DeliveryLeadDetails> findDistinctByDeliveryLeadCTSId();
}
