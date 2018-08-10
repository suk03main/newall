package com.wind.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("/board/view")
	public String view(Model model) {
	model.addAttribute("id", 20);
	model.addAttribute("name", "abc");
	System.out.println(model);
	
	return "/board/view";
		
}
	@RequestMapping("/board/content")
	public String content(Model model) {
		model.addAttribute("id", 10);
		model.addAttribute("pw", 1111);
		System.out.println(model);
		return "/board/content";
		
}
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 15);
		mv.addObject("name", "wind");
		mv.setViewName("/board/reply");
		return mv;
		
}
	@RequestMapping("/board/content")
	public ModelAndView content() {
	ModelAndView mc = new ModelAndView();
	mc.addObject("id", "aaa");
	mc.addObject("pw", "1111");
	mc.setViewName("/board/content");
	return mc;
}
	
	@RequestMapping("/board/view")
	public ModelAndView view() {
		ModelAndView a = new ModelAndView();
		a.addObject("id", "djks");
		a.addObject("pw", "1212");
		a.setViewName("/board/view");
		return a;
	}	
	
}