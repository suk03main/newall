package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.service.MListService;

@Controller
public class MController {
	
 MListService service=null;

	@RequestMapping("/list")
	public String list(Model model) {
		service = new MListService();		
		service.excute(model);
		return "list";
	}
	@RequestMapping("/write_view")
	public String wirte_view(Model model) {
		System.out.println("write_view");
		return "write_view";
	}
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
	service = new MWriteService();
	service.excute(model);
	return "redirect:list";
	}
}
