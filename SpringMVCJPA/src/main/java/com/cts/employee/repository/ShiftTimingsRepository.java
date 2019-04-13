package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.ShiftTimings;

public interface ShiftTimingsRepository extends JpaRepository<ShiftTimings, String>{

	@Query ("SELECT shiftTiming FROM ShiftTimings")
	public List<String> findAllShiftTimings();
	
}
