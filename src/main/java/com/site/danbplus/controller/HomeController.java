package com.site.danbplus.controller;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;


@Controller
public class HomeController {
	

	@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main/dashboard");
		 System.out.print("####     /       >>>    main/dashboard     #####");
		return mv;
	}
	
	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login/login");
		 System.out.print("####     /login       >>>    login/login     #####");
		return mv;
	}
	
	/*
	@RequestMapping(value="/main/dashboard", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView dashboard() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main/dashboard");
		 System.out.print("####      main/dashboard     >>>     main/dashboard     #####");
		return mv;
	}
	*/
}
