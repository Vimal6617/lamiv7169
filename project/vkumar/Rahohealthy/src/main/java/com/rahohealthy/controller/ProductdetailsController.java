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
import org.springframework.ui.ModelMap;

import com.rahohealthy.model.Productdetails;
import com.rahohealthy.service.MerchantdetailsService;
import com.rahohealthy.service.ProductdetailsService;
import com.rahohealthy.model.Merchantdetails;

@Controller
public class ProductdetailsController {
	
	@Autowired
	private ProductdetailsService productService;
	@Autowired
	private MerchantdetailsService merchantService;
	
	/*
	@RequestMapping({"/index", "/"})
	public String setupForm(Map<String, Object> map){
		Productdetails productdetails = new Productdetails();
		map.put("productdetails", productdetails);
		map.put("resutlist", productService.getAllProductdetails());
		
		return "productdetails";
	}
	*/
	
	
	
	@RequestMapping(value = { "/addproduct" }, method = RequestMethod.GET)
	public String addproduct(Map<String, Object> map) {
		Productdetails productdetails = new Productdetails();
		map.put("productdetails", productdetails);
		map.put("resutlist", productService.getAllProductdetails());
		return "addproduct";
	}
	
	
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Productdetails productdetails, BindingResult result,
			@RequestParam String action, Map<String, Object> map){
		Productdetails productResult = new Productdetails();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			productService.addproduct(productdetails);
			productResult = productdetails;
			break;
			/*
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getStudentId());
			studentResult = new Productdetails();
			break;
		case "search":
			Productdetails searchedStudent = studentService.getStudent(student.getStudentId());
			studentResult = searchedStudent!=null ? searchedStudent : new Productdetails();
			break;
			*/
		}
		map.put("addproduct", productResult);
		map.put("resultList", productService.getAllProductdetails());
		return "addproduct";
	}
	
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
	
	
	@RequestMapping("/login")
	public String doLogin(){
		return "login";

	}
	
	@RequestMapping("/merchantloggedIN")
	public String getMerchantResult(Model model)
	{	 
		model.addAttribute("merchantloggedIN", new Merchantdetails());
		model.addAttribute("Merchantlist", this.merchantService.getAllMerchantdetails());
		return "merchantloggedIN";
	}
	
}
