package com.rahohealthy.service;

import java.util.List;

import com.rahohealthy.model.Productdetails;

public interface ProductdetailsService {
	
	public void addproduct(Productdetails productdetails);
	public Productdetails getProductdetails(int product_id );
	public List getAllProductdetails();
}
