package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BillTable")
public class BillEntity {
	@Id
  private int id;
  
  private String name;
  
  private String bill;

public BillEntity(int id, String name, String bill) {
	super();
	this.id = id;
	this.name = name;
	this.bill = bill;
}

public BillEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBill() {
	return bill;
}

public void setBill(String bill) {
	this.bill = bill;
}




}