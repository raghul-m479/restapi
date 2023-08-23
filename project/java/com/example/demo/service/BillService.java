package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BillEntity;
import com.example.demo.repository.BillRepo;

@Service
public class BillService {
     

    @Autowired
    BillRepo sr;
    
    
    public BillEntity saveInfo(BillEntity ss) {
    	return sr.save(ss);	
    }
    public List<BillEntity> savedetails(List<BillEntity> ss)
    {
    	return (List<BillEntity>)sr.saveAll(ss);
    }
    
    public List<BillEntity> showInfo()
    {
    	return sr.findAll();
    }
    
    public BillEntity changeInfo(BillEntity ss)
    {
    	return sr.saveAndFlush(ss);
    }
   

}