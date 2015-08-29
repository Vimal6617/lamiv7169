package com.rahohealthy.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
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



@Service("userDetailsService")
public class MerchantdetailsServiceImpl implements UserDetailsService{

	@Autowired
	private MerchantdetailsDao merchantdetailsdao;
	
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String merchant_email)
			throws UsernameNotFoundException {
		Merchantdetails merchantdetails = merchantdetailsdao.findUserByEmail(merchant_email); //our own User model class
		
		if(merchantdetails!=null){
			String password = merchantdetails.getmerchant_password();
			//additional information on the security object
			boolean enabled = merchantdetails.getMerchantstatus().equals(Merchant_Status.ACTIVE);
			boolean accountNonExpired = merchantdetails.getMerchantstatus().equals(Merchant_Status.ACTIVE);
			boolean credentialsNonExpired = merchantdetails.getMerchantstatus().equals(Merchant_Status.ACTIVE);
			boolean accountNonLocked = merchantdetails.getMerchantstatus().equals(Merchant_Status.ACTIVE);
			
			//Let's populate user roles
			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for(Merchant_Role merchant_role : merchantdetails.getMerchant_Role()){
				authorities.add(new GrantedAuthorityImpl(merchant_role.getMerchant_roleName()));
			}
			
			//Now let's create Spring Security User object
			org.springframework.security.core.userdetails.User securityUser = new 
					org.springframework.security.core.userdetails.User(merchant_email, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securityUser;
		}else{
			throw new UsernameNotFoundException("User Not Found!!!");
		}
	}

}
