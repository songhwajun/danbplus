package com.danbplus.util;

import java.security.MessageDigest;

	public class SHA256Util {
	/**
	 * SHA-256 암호화
	 * @param str 암호화할 데이터
	 * @return
	 */
	public static String encryptSHA256(String str) {
		return encrypt(str, "SHA-256");
    }
	
	/**
	 * 암호화
	 * @param str // 암호화할 데이터
	 * @param messageDigest // 암호화 방식
	 * @return
	 */
	public static String encrypt(String str, String messageDigest) {
       try {
           MessageDigest md = MessageDigest.getInstance(messageDigest);
           byte[] passBytes = str.getBytes();
           md.reset();
           byte[] digested = md.digest(passBytes);
           StringBuilder sb = new StringBuilder();
           for (int i = 0; i < digested.length; i++) sb.append(Integer.toString((digested[i] & 0xff) + 0x100, 16).substring(1));
           return sb.toString();
           
       } catch (Exception e) {
           return str;
       }
	}
}
