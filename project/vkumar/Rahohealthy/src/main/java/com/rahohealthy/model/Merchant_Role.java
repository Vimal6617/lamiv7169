package com.rahohealthy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Merchant_Role")
public class Merchant_Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Merchant_roleName;
	@ManyToMany(mappedBy = "roles")
	private List<Merchantdetails> merchant_details;
	
	public Merchant_Role(){}

	public Merchant_Role(int id, String Merchant_roleName, List<Merchantdetails> merchant_details) {
		super();
		this.id = id;
		this.Merchant_roleName = Merchant_roleName;
		this.merchant_details = merchant_details;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchant_roleName() {
		return Merchant_roleName;
	}

	public void setMerchant_roleName(String Merchant_roleName) {
		this.Merchant_roleName = Merchant_roleName;
	}

	public List<Merchantdetails> getMerchantdetails() {
		return merchant_details;
	}

	public void setUsers(List<Merchantdetails> users) {
		this.merchant_details = merchant_details;
	}
	
}
