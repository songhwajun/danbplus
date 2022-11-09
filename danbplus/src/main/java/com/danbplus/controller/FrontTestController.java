package com.danbplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontTestController {
	

	@RequestMapping(value="/userLogin", method = {RequestMethod.GET, RequestMethod.POST})
	public String login() {
		System.out.println("===========================================");
		System.out.println("로그인");
		System.out.println("===========================================");
		return "test/DANBTST001_10V.view";
	}
	
	@RequestMapping(value="/userPasswordModify", method = {RequestMethod.GET, RequestMethod.POST})
	public String userPasswordModify() {
		System.out.println("===========================================");
		System.out.println("비밀번호 변경 (1회 한정)");
		System.out.println("===========================================");
		return "test/DANBTST001_20V.tiles";
	}
	
	
	@RequestMapping(value="/userModify", method = {RequestMethod.GET, RequestMethod.POST})
	public String userModify() {
		System.out.println("===========================================");
		System.out.println("정보수정");
		System.out.println("===========================================");
		return "test/DANBTST001_30V.tiles";
	}
	
	@RequestMapping(value="/sign", method = {RequestMethod.GET, RequestMethod.POST})
	public String sign() {
		System.out.println("===========================================");
		System.out.println("회원가입");
		System.out.println("===========================================");
		return "test/DANBTST001_40V.tiles";
	}
}
