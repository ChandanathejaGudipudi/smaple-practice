package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.SegmentDetails;

public interface SegmentDetailsRepository extends JpaRepository<SegmentDetails, String>{
	
}