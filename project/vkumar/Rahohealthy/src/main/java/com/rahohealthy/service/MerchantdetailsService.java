package com.rahohealthy.service;

import java.util.List;

import com.rahohealthy.model.Merchantdetails;

public interface MerchantdetailsService {
	
	Merchantdetails findUser(int merchant_id);
	Merchantdetails findUserByEmail(String merchant_email);
	Merchantdetails findUserByName(String merchant_firstname);
	List<Merchantdetails> getAllMerchantdetails();

}
