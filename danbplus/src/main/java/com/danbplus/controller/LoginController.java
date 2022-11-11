package com.danbplus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danbplus.util.mybatis.MybatisService;

@RestController
public class LoginController {
	@Autowired
	private MybatisService codeService;
	
	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String getLogin(HttpServletRequest request) {
		return "/login/DANBLGN001_10V.view";
	}
}
