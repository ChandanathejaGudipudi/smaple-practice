package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.employee.entity.CtsGrade;

public interface CtsGradeRepository extends JpaRepository<CtsGrade, String>{

	@Query ("SELECT cTSGrade FROM CtsGrade")
	public List<String> findAllCtsGrades();
	
}
