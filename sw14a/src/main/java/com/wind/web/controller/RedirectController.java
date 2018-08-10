package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/student_confirm")
	public String studentRedirect(
		HttpServletRequest httpServletRequest,
		Model model
		) {
	
		String id= httpServletRequest.getParameter("id");
		model.addAttribute("id",id);
		if(id.equals("abc")) {
			return "redirect:student_ok";
			
		}
		return "redirect:student_ng";
		
	}
	
	

}
