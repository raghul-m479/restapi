package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.BillEntity;



public interface BillRepo extends JpaRepository<BillEntity, Integer>{
   
	
}