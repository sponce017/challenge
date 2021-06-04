package com.equifax.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.equifax.dev.model.dao.ProductoDao;

@Controller
public class ChallengeController {
	
	@Autowired
	ProductoDao pdao;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	 @GetMapping("/index")
	 public String homePage(Model model) {
	        //model.addAttribute("appName", appName);
		 Long id = new Long("1");		 
		 pdao.findAllActiveProdByCliente(id);
		 return "index";
	  }
}
