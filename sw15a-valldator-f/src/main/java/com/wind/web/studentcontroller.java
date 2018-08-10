package com.wind.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentcontroller {
	
	@RequestMapping("/student_form")
	public String studentForm() {
		return "create_page";
	}
	@RequestMapping("/create")
	public String studentCreate(
		
			@Valid Student student, BindingResult result) {

		String page= "create_done_page";
		
	/*	StudentValldator valldator = new StudentValldator();
		valldator.validate(student, result);*/
		if(result.hasErrors()) {
			page="create_page";
		}
		
		
		return page;
		
		
}
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValldator());
	}



}

