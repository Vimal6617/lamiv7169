package com.rahohealthy.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rahohealthy.dao.ProductdetailsDao;
import com.rahohealthy.model.Productdetails;
import com.rahohealthy.service.ProductdetailsService;

@Service
public class ProductdetailsServiceimpl implements ProductdetailsService {
	
	@Autowired
	private ProductdetailsDao ProductdetailsDao;
	
	@Transactional
	public Productdetails getProductdetails(int product_id) {
		return ProductdetailsDao.getProductdetails(product_id );
	}

	@Transactional
	public void  addproduct(Productdetails productdetails){
		ProductdetailsDao.addproduct(productdetails);
	}
	@Transactional
	public List getAllProductdetails(){
		
		return ProductdetailsDao.getAllProductdetails();
	}

}
