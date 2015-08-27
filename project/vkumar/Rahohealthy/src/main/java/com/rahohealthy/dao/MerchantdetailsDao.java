package com.rahohealthy.dao;

import java.util.List;

import com.rahohealthy.model.Merchantdetails;

public interface MerchantdetailsDao {

	Merchantdetails findUser(int merchant_id);
	Merchantdetails findUserByEmail(String merchant_email);
	List<Merchantdetails> getAllMerchantdetails();
	
}
