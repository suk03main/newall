package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/next")
public class nextContiller {	

@RequestMapping("/pageone")
	public String next1(Model modle) {			
	modle.addAttribute("id", 911);
		
		return "next/pageone";
	}

}
