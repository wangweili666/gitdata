package com.nasoft.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value="enterIndexPage")
	public ModelAndView enterIndexPage(ModelAndView modelAndView){
		System.out.println("进入主页刷新页面.."); 
		modelAndView.setViewName("user/index");
		return modelAndView;
	}
	
	
	
	
}
