package com.rahohealthy.dao;

import java.util.List;

import com.rahohealthy.model.Productdetails;

public interface ProductdetailsDao {
	
	public Productdetails getProductdetails(int product_id );
	public List getAllProductdetails();
}
