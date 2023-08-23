package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BillEntity;
import com.example.demo.service.BillService;

@RestController
public class BillController {
	
	@Autowired
     BillService sser;
	
	
	@PostMapping("addBill")
	public BillEntity add(@RequestBody  BillEntity ss)
	{
		return sser.saveInfo(ss);
	}
	@PostMapping("addnBill")
	public List<BillEntity> addndetails(@RequestBody List<BillEntity> ss)
	{
		return sser.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<BillEntity> show()
	{
		return sser.showInfo();
	}
	
	@PutMapping("update")
	public BillEntity modify(@RequestBody BillEntity ss)
	{
		return sser.changeInfo(ss);
	}
	
	
	
	

}