package com.springmvc.spike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/spike.html")
	public ModelAndView pleaseWork(@RequestParam(value="name", required=false, defaultValue="Dude")String name){
		return new ModelAndView("spike", "name", name);
	}

}
