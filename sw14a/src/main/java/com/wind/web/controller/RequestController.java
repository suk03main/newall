package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
		
	}
	//@RequestMapping(value="/student",method=RequestMethod.POST)
	//@RequestMapping(value="/student",method=RequestMethod.Get)
	@RequestMapping(value="/student")
	//@RequestMapping(value="/student",method={RequestMethod.Get,RequestMethod.POST)
	
	
	
	public String goStudent(
			HttpServletRequest httpsHttpServletRequest,
			Model model) {
		String id = httpsHttpServletRequest.getParameter("id");
		String pw = httpsHttpServletRequest.getParameter("pw");
		
		
		model.addAttribute("studentId",id);
		model.addAttribute("studentPw",pw);
		
		
		return "student";
	}
	

}
