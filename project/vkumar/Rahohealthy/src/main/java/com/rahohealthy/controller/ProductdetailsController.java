package com.rahohealthy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;



import com.rahohealthy.model.Productdetails;
import com.rahohealthy.service.ProductdetailsService;

@Controller
public class ProductdetailsController {
	
	@Autowired
	private ProductdetailsService productService;
	
	@RequestMapping(value ="/searchresult")
	public String getResult(Model model)
	{	 
		model.addAttribute("searchresult", new Productdetails());
		model.addAttribute("resutlist", this.productService.getAllProductdetails());
		return "searchresult";
	}
	
	@RequestMapping("/vimal")
	public ModelAndView sayhi(){
		
		String a = "<br><div style='text-aign:center;'>"  + "<h1>***********hi VImal ";
		return new ModelAndView("vimal", "a" , a);
	}
	

}
