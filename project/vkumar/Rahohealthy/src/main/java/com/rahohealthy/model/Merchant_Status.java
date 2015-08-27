package com.rahohealthy.model;

public enum Merchant_Status {
	ACTIVE("Active"),
	INACTIVE("Inactive"),
	DELETED("Deleted"),
	LOCKED("Locked");
	
	private String merchant_status;
	
	private Merchant_Status(final String merchant_status){
		this.merchant_status = merchant_status;
	}
	
	public String getMerchantStatus(){
		return this.merchant_status;
	}

	@Override
	public String toString(){
		return this.merchant_status;
	}

	public String getName(){
		return this.name();
	}


}