package com.rahohealthy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rahohealthy.dao.MerchantdetailsDao;
import com.rahohealthy.model.Merchantdetails;
import com.rahohealthy.service.MerchantdetailsService;

@Service
public class MerchantdetailsServiceimpl implements  MerchantdetailsService{
	
	@Autowired
	private MerchantdetailsDao merchantdetailsdao;
	
	@Transactional
	public Merchantdetails findUser(int merchant_id){
		return merchantdetailsdao.findUser(merchant_id);
	}
	
	@Transactional
	public Merchantdetails findUserByName(String merchant_firstname){
		return merchantdetailsdao.findUserByName(merchant_firstname);
	}
	
	@Transactional
	public Merchantdetails findUserByEmail(String merchant_email){
		return merchantdetailsdao.findUserByEmail(merchant_email);
	}
	
	@Transactional
	public List getAllMerchantdetails(){
		
		return merchantdetailsdao.getAllMerchantdetails();
	}

	

}
