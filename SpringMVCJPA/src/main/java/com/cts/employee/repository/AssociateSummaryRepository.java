package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.AssociateSummary;

public interface AssociateSummaryRepository extends JpaRepository<AssociateSummary, Integer>{
	
	public AssociateSummary findByAssociateCTSId(Integer associate_CTS_Id);
	
	@Query("SELECT e FROM AssociateSummary e WHERE e.projectId=?")
	public List<AssociateSummary> findAllByProjectId(Integer projectId);

	public List<AssociateSummary> findBySeatNumber(String seatNumber);
	
	@Query("SELECT shift_Timing FROM AssociateSummary p WHERE seatNumber=?")
	public String findAvailSeatNumberWithTime(String seatNumber);
	
	@Query("SELECT allowed FROM ShiftConfig WHERE shiftFrom=? and shiftTo=?")
	public String checkShiftTime(String seatExistsTimeOriginal, String shiftTimings);
}
