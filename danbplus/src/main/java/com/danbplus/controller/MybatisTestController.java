package com.danbplus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.danbplus.mybatis.MybatisTestService;
import com.danbplus.vo.common.COD_MGT;

@RestController
public class MybatisTestController {
	@Autowired
	private MybatisTestService codeService;
	
	@GetMapping("/code")
	public List<COD_MGT> getCodeList() {
		System.out.println("===========================================");
		System.out.println("CodeController [code]");
		System.out.println("===========================================");
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("cod_depth", "1");
		return codeService.getCodeList(hashMap);
	}
	
	@GetMapping("/code2")
	public ModelAndView getCodeList2() {
		System.out.println("===========================================");
		System.out.println("CodeController [code2]");
		System.out.println("===========================================");
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("cod_depth", "1");

		List CodeList = new ArrayList();
		CodeList = codeService.getCodeList(param); // ArrayList
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("codeList", CodeList);
		mv.setViewName("test.tiles");
		return mv;
	}
}
