package com.rahohealthy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rahohealthy.model.Merchantdetails;
import com.rahohealthy.model.Merchant_Role;

@Service("customUserDetailsService")
public class customMerchantDetailsService implements UserDetailsService{

	@Autowired
	private MerchantdetailsService  merchantdetailsservice;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String merchant_email)
			throws UsernameNotFoundException {
		Merchantdetails merchantdetails = merchantdetailsservice.findUserByEmail(merchant_email);
		System.out.println("User : "+merchantdetails);
		if(merchantdetails==null){
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
			return new org.springframework.security.core.userdetails.User(merchantdetails.getmerchant_email(), merchantdetails.getmerchant_password(), 
				 merchantdetails.getMerchantstatus().equals("Active"), true, true, true, getGrantedAuthorities(merchantdetails));
	}

	
	private List<GrantedAuthority> getGrantedAuthorities(Merchantdetails merchantdetails){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for(Merchant_Role merchant_role : merchantdetails.getMerchant_Role()){
			System.out.println("UserProfile : "+merchant_role);
			authorities.add(new SimpleGrantedAuthority("ROLE_"+merchant_role.getType()));
		}
		System.out.print("authorities :"+authorities);
		return authorities;
	}
	
}
