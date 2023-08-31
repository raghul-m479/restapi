package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BillEntity;

import jakarta.transaction.Transactional;



public interface BillRepo extends JpaRepository<BillEntity, Integer>{
   
	@Query(value="select * from BillTable where custid=:s ",nativeQuery=true)
	public List<BillEntity> getBillInfo(@Param("s") int custid);
	
	
	
	
	@Modifying
	@Transactional
	@Query(value="update BillTable set buyer=?1 where buyer=?2",nativeQuery = true)
	public int updateBillInfo(String oldbuyer,String newbuyer);
	
}