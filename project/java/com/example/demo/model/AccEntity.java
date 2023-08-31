package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="audittable")
public class AccEntity {
     
	@Id
	private int accid;
	private String name;
	private int gstno;
	private int revenue;
	private int profit;
	public AccEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccEntity(int accid, String name, int gstno, int revenue, int profit) {
		super();
		this.accid = accid;
		this.name = name;
		this.gstno = gstno;
		this.revenue = revenue;
		this.profit = profit;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGstno() {
		return gstno;
	}
	public void setGstno(int gstno) {
		this.gstno = gstno;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	
	
     
	
}
