package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public List<BillEntity> sort(String str)
    {
    	return sr.findAll(Sort.by(str).descending());
    }
    
    public List<BillEntity> paging(int cur,int tot)
    {
    	Page<BillEntity> page=sr.findAll(PageRequest.of(cur,tot));
    	return page.getContent();
    	
    }
    
    public List<BillEntity> pageandsort(int cur,int tot,String str)
    {
    	Page<BillEntity> page=sr.findAll(PageRequest.of(cur,tot,Sort.by(str)));
    	return page.getContent();
    }
    public List<BillEntity> getbill(int custid)
    {
    	return sr.getBillInfo(custid);
    }
    
    public int updatebill(String oldbuyer,String newbuyer )
    {
    	return sr.updateBillInfo(oldbuyer, newbuyer);
    }
   

}