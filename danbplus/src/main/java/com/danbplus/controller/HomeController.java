package com.danbplus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danbplus.util.Util;

@Controller
public class HomeController {
	@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public String home(HttpServletRequest request, HttpSession session) {
		String userId = Util.nvl((String) session.getAttribute("UserId"));
	
		if(userId == null) {
			return "redirect:/login";
		}
		
		
		return "main/DANBMAN001_10V.tiles";
	}
}
