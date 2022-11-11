package com.danbplus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.danbplus.config.vo.COD_MGT;
import com.danbplus.config.vo.LOGIN_MGT;
import com.danbplus.util.Util;
import com.danbplus.util.mybatis.MybatisService;

@RestController
public class MybatisController {
	@Autowired
	private MybatisService codeService;
	
	@GetMapping("/code")
	public List<COD_MGT> getCodeList() {
		System.out.println("===========================================");
		System.out.println("MybatisController [code]");
		System.out.println("===========================================");
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("cod_depth", "1");
		return codeService.getCodeList(paramMap);
	}
	
	@GetMapping("/code2")
	public ModelAndView getCodeList2() { 
		System.out.println("===========================================");
		System.out.println("MybatisController [code2]");
		System.out.println("===========================================");
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("cod_depth", "1");

		List CodeList = new ArrayList();
		CodeList = codeService.getCodeList(param); // ArrayList
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("codeList", CodeList);
		mv.setViewName("test.tiles");
		return mv;
	}
}
