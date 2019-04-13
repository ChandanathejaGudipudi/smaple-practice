package com.cts.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String>{
	public Users findByCtsIdAndStatus(int parseInt,String status );
	
	
@Query("SELECT Role FROM Users WHERE ctsId=? and pwd=? and status=?")
public String findByCtsIdAndStatusAndPwd(int parseInt, String pwd, String status);

@Modifying(clearAutomatically = true)
@Transactional
@Query("UPDATE Users u SET u.pwd =:isPwd  WHERE u.ctsId=:Id")
public int updatePwd(@Param("isPwd") String pwd, @Param("Id") int parseInt);

}
