package com.danbplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	

	@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public String index(Model model) {
		System.out.println("===========================================");
		System.out.println("Main");
		System.out.println("===========================================");

		// ������ ����
		model.addAttribute("key", "val");
		return "main/main.tiles";
	}
	
	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login() {
		System.out.println("===========================================");
		System.out.println("Login");
		System.out.println("===========================================");
		
		ModelAndView mv = new ModelAndView();
		// ������ ����
		mv.addObject("key", "val");
		// ȣ�� url ����
		mv.setViewName("login/login.view");
		
		return mv;
	}
}
