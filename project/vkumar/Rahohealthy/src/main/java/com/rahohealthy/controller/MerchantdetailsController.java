package com.rahohealthy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class MerchantdetailsController {

	
	@RequestMapping("/login")
	public String doLogin(){
		return "login";

	}
	
	@RequestMapping("/merchantloggedIN")
	public ModelAndView sayhi(){
		
		String a = "<br><div style='text-aign:center;'>"  + "<h1>***********hi VImal ";
		return new ModelAndView("merchantloggedIN", "a" , a);
	}
	
	
	@RequestMapping("/vimal")
	public ModelAndView sayhei(){
		
		String a = "<br><div style='text-aign:center;'>"  + "<h1>***********hi VImal ";
		return new ModelAndView("vimal", "a" , a);
	}
}
