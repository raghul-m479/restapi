package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="BillTable")
public class BillEntity {
	@Id
  private int id;
  
  private String name;
  
  private String bill;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fkid")
  public AccEntity ae;
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "id")
  public List<TaxEntity> te;

public BillEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public BillEntity(int id, String name, String bill, AccEntity ae, List<TaxEntity> te) {
	super();
	this.id = id;
	this.name = name;
	this.bill = bill;
	this.ae = ae;
	this.te = te;
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

public AccEntity getAe() {
	return ae;
}

public void setAe(AccEntity ae) {
	this.ae = ae;
}

public List<TaxEntity> getTe() {
	return te;
}

public void setTe(List<TaxEntity> te) {
	this.te = te;
}

   

}