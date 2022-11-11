package com.danbplus.util;

import java.util.regex.Pattern;

public class Util {
	
	/**
	 * null 체크
	 * @param str
	 * @return
	 */
	public static String nvl(String str) {
		return str != null ? str : null;
	}
	
	/**
	 * null 체크
	 * @param str
	 * @param defaultStr
	 * @return
	 */
	public static String nvl(String str, String defaultStr) {
		return str != null ? str : defaultStr;
	}
	
	/**
	 * 유효성 검사 (숫자)
	 * @param str
	 * @return
	 */
	public static boolean chkNum(String str) {
		return Pattern.matches("^[0-9]*$", str);
	}
	
	/**
	 * 유효성 검사 (영문자)
	 * @param str
	 * @return
	 */
	public static boolean chkEng(String str) {
		return Pattern.matches("^[a-zA-Z]*$", str);
	}
	
	/**
	 * 유효성 검사 (한글)
	 * @param str
	 * @return
	 */
	public static boolean chkKor(String str) {
		return Pattern.matches("^[가-힣]*$", str);
	}
	
	/**
	 * 유효성 검사 (이메일)
	 * @param str
	 * @return
	 */
	public static boolean chkEmail(String str) {
		return Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", str);
	}
	
	/**
	 * 유효성 검사 (휴대폰번호)
	 * @param str
	 * @return
	 */
	public static boolean chkPhone(String str) {
		return Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", str);
	}
}
