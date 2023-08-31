package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("sort/{str}")
	public List<BillEntity> sort(@PathVariable String str)
	{
		return sser.sort(str);
	}
	
	@GetMapping("paging/{cur}/{tot}")
	public List<BillEntity> paging(@PathVariable int cur,@PathVariable int tot)
	{
		return sser.paging(cur, tot);
	}
	
	@GetMapping("pageandsort/{cur}/{tot}/{str}")
	public List<BillEntity> pageandsort(@PathVariable int cur,@PathVariable int tot,@PathVariable String str)
	{
		return sser.pageandsort(cur, tot, str);
	}
	
	@GetMapping("showquery/{custid}")
	public List<BillEntity> showbilldetails(@PathVariable int custid)
	{
		return sser.getbill(custid);
	}
	
	@PutMapping("updatequery/{newbuyer}/{oldbuyer}")
	public String updatebilldetails(@PathVariable String newbuyer,@PathVariable String oldbuyer)
	{
		return sser.updatebill(newbuyer, oldbuyer)+"updated";
	}
	
	

}