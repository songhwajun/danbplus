package com.danbplus.config.vo;

import java.sql.Timestamp;

public class IMG_URL {
	private String img_url;	   // 이미지 경로
	private String img_nm;     // 파일명
	private String reg_nm;     // 등록자
	private Timestamp reg_dt;  // 등록일
	
	public IMG_URL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IMG_URL(String img_url, String img_nm, String reg_nm, Timestamp reg_dt) {
		super();
		this.img_url = img_url;
		this.img_nm = img_nm;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getImg_nm() {
		return img_nm;
	}

	public void setImg_nm(String img_nm) {
		this.img_nm = img_nm;
	}

	public String getReg_nm() {
		return reg_nm;
	}

	public void setReg_nm(String reg_nm) {
		this.reg_nm = reg_nm;
	}

	public Timestamp getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(Timestamp reg_dt) {
		this.reg_dt = reg_dt;
	}

	@Override
	public String toString() {
		return "IMG_URL [img_url=" + img_url + ", img_nm=" + img_nm + ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
