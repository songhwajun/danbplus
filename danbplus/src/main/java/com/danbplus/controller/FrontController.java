package com.danbplus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	
	/* 
	 * 공통 화면
	 */
	@RequestMapping(value="/popup", method = {RequestMethod.GET, RequestMethod.POST})
	public String popup(HttpServletRequest request) {
		return "popup/DANBPOP001_10V.view";
	}

	@RequestMapping(value="/common_1", method = {RequestMethod.GET, RequestMethod.POST})
	public String common_1(HttpServletRequest request) {
		return "common/DANBCMM001_10V.view";
	}
	
	@RequestMapping(value="/common_2", method = {RequestMethod.GET, RequestMethod.POST})
	public String common_2() {
		return "common/DANBCMM001_20V.tiles";
	}
	
	@RequestMapping(value="/common_3", method = {RequestMethod.GET, RequestMethod.POST})
	public String common_3() {
		return "common/DANBCMM001_30V.tiles";
	}
	
	/* 
	 * 사용자 화면
	 */
	@RequestMapping(value="/user_1", method = {RequestMethod.GET, RequestMethod.POST})
	public String user_1() {
		return "user/DANBUSR001_10V.tiles";
	}
	
	@RequestMapping(value="/user_2", method = {RequestMethod.GET, RequestMethod.POST})
	public String user_2() {
		return "user/DANBUSR001_20V.tiles";
	}
	
	/* 
	 * 승인자 화면
	 */
	@RequestMapping(value="/aprv_1", method = {RequestMethod.GET, RequestMethod.POST})
	public String aprv_1() {
		return "aprv/DANBAPV001_10V.tiles";
	}

	/* 
	 * 관리자 화면
	 */
	@RequestMapping(value="/admin_1", method = {RequestMethod.GET, RequestMethod.POST})
	public String admin_1() {
		return "admin/DANBADM001_10V.tiles";
	}
}
