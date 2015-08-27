package com.rahohealthy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Merchantdetails {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchant_id;
	@Column
	private String merchant_email;
	@Column
	private String merchant_firstname;
	@Column
	private String merchant_lastname;
	@Column
	private String merchant_address1;
	@Column
	private String merchant_password;
	
	
	@ManyToMany
	@JoinTable(name="MerchantDetailsAndRoles",
			joinColumns=@JoinColumn(name="merchant_id"),
			inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<MerchantRole> merchant_role;
	@Enumerated(EnumType.STRING)
	private MerchantStatus merchant_status;
	
	public Merchantdetails(){}
	
	public Merchantdetails(int merchant_id,String merchant_email, String merchant_firstname,String merchant_lastname, String merchant_address1,String merchant_password,String merhcnat_usertype)
	{
		super();
		this.merchant_id = merchant_id;
		this.merchant_email = merchant_email;
		this.merchant_firstname = merchant_firstname;
		this.merchant_lastname = merchant_lastname;
		this.merchant_address1 = merchant_address1;
		this.merchant_password = merchant_password;
		this.merchant_role = merchant_role;
		this.merchant_status = merchant_status;
	
	}

	public int getmerchant_id() {
		return merchant_id;
	}
	public void setmerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}
	
	public String getmerchant_email() {
		return merchant_email;
	}
	public void setmerchant_email(String merchant_email) {
		this.merchant_email = merchant_email;
	}
	public String getmerchant_firstname() {
		return merchant_firstname;
	}
	public void setmerchant_firstname(String merchant_firstname) {
		this.merchant_firstname = merchant_firstname;
	}
	public String getmerchant_lastname() {
		return merchant_lastname;
	}
	public void setmerchant_lastname(String merchant_lastname) {
		this.merchant_lastname = merchant_lastname;
	}
	public String getmerchant_address1() {
		return merchant_address1;
	}
	public void setmerchant_address1(String merchant_address1) {
		this.merchant_address1 = merchant_address1;
	}
	public String getmerchant_password() {
		return merchant_password;
	}
	public void setmerchant_password(String merchant_password) {
		this.merchant_password = merchant_password;
	}
	public List<MerchantRole> getMerchantRole() {
		return merchant_role;
	}

	public void setMerchantRole(List<MerchantRole> merchant_role) {
		this.merchant_role = merchant_role;
	}
	public MerchantStatus getMerchant_status() {
		return merchant_status;
	}

	public void setMerchant_status(MerchantStatus merchant_status) {
		this.merchant_status = merchant_status;
	}
}
