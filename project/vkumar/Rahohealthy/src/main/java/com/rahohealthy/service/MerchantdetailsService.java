package com.rahohealthy.service;

import java.util.List;

import com.rahohealthy.model.Merchantdetails;

public interface MerchantdetailsService {
	
	Merchantdetails findUser(int merchant_id);
	Merchantdetails findUserByEmail(String merchant_email);
	List<Merchantdetails> getAllMerchantdetails();

}
