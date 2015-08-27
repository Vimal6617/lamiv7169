package com.rahohealthy.model;

public enum Merchant_RoleType {
	Merchant("Merchant"),	
	ADMIN("ADMIN");
	
	String Merchant_RoleType;
	
	private Merchant_RoleType(String Merchant_RoleType){
		this.Merchant_RoleType = Merchant_RoleType;
	}
	
	public String getMerchant_RoleType(){
		return Merchant_RoleType;
	}
	
}