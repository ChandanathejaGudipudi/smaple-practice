package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.SectorDetails;

public interface SectorDetailsRepository extends JpaRepository<SectorDetails, Integer>{
	
}
