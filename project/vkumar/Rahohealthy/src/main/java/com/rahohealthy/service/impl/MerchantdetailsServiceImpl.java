package com.rahohealthy.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rahohealthy.dao.MerchantdetailsDao;
import com.rahohealthy.model.Merchant_Status;
import com.rahohealthy.model.Merchantdetails;
import com.rahohealthy.model.Merchant_Role;
import com.rahohealthy.model.Productdetails;
import com.rahohealthy.service.MerchantdetailsService;

@Service
public class MerchantdetailsServiceImpl implements MerchantdetailsService{
	
	@Autowired
	private MerchantdetailsDao merchantdetailsDao;
	
	@Transactional
	public Merchantdetails findUser(int merchant_id) {
		return merchantdetailsDao.findUser(merchant_id );
	}
	
	@Transactional
	public Merchantdetails findUserByEmail(String merchant_email) {
		return merchantdetailsDao.findUserByEmail(merchant_email );
	}
	
	@Transactional
	public List getAllMerchantdetails(){
		return merchantdetailsDao.getAllMerchantdetails();
	}

	

}