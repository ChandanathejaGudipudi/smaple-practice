package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.employee.entity.SubProcessDetails;

public interface SubProcessDetailsRepository extends JpaRepository<SubProcessDetails, String>{

	List<SubProcessDetails> findByProcessCode(String processCode);

}
