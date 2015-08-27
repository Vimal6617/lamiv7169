package com.rahohealthy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MerchantdetailsController {

	
	@RequestMapping("/login")
	public String doLogin(){
		return "login";
	}
	
}
