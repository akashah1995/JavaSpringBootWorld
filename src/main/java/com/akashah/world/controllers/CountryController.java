package com.akashah.world.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akashah.world.models.Country;
import com.akashah.world.services.ApiService;

@Controller
public class CountryController {
	
	ApiService apiService;
	
	CountryController (ApiService apiService) {
		this.apiService = apiService;
	}
	
	
	@RequestMapping("/")
	public String home() {
		List <Object[]> countriesSlovene = apiService.getCityCount();
//		System.out.println(countriesSlovene.get(0).getName());
		
		for (int i = 0; i < countriesSlovene.size(); i++) {
			
			System.out.println(countriesSlovene.get(i)[0]);
			System.out.println(countriesSlovene.get(i)[1]);
			
			
		}
		
		
		
		
		
		return "home.jsp";
		
	
	
	
	}
	
	
	

}
