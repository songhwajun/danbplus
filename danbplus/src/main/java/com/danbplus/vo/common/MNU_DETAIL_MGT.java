package com.danbplus.vo.common;

import java.sql.Timestamp;

public class MNU_DETAIL_MGT {
	private String mnu_gb;					// 메뉴 구분
	private int mnu_detail_depth;       	// 메뉴 상세 depth
	private String mnu_detail_description;  // 메뉴 상세설명
	private int mnu_order;            	    // 메뉴 순서
	private String mnu_no;                  // 메뉴 번호
	private String mnu_detail_show_yn;      // 메뉴 노출YN
	private String mnu_detail_gb;           // 메뉴 상세 구분
	private String reg_nm;                  // 등록자
	private Timestamp reg_dt;               // 등록일
	
	public MNU_DETAIL_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MNU_DETAIL_MGT(String mnu_gb, int mnu_detail_depth, String mnu_detail_description, int mnu_order,
			String mnu_no, String mnu_detail_show_yn, String mnu_detail_gb, String reg_nm, Timestamp reg_dt) {
		super();
		this.mnu_gb = mnu_gb;
		this.mnu_detail_depth = mnu_detail_depth;
		this.mnu_detail_description = mnu_detail_description;
		this.mnu_order = mnu_order;
		this.mnu_no = mnu_no;
		this.mnu_detail_show_yn = mnu_detail_show_yn;
		this.mnu_detail_gb = mnu_detail_gb;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getMnu_gb() {
		return mnu_gb;
	}

	public void setMnu_gb(String mnu_gb) {
		this.mnu_gb = mnu_gb;
	}

	public int getMnu_detail_depth() {
		return mnu_detail_depth;
	}

	public void setMnu_detail_depth(int mnu_detail_depth) {
		this.mnu_detail_depth = mnu_detail_depth;
	}

	public String getMnu_detail_description() {
		return mnu_detail_description;
	}

	public void setMnu_detail_description(String mnu_detail_description) {
		this.mnu_detail_description = mnu_detail_description;
	}

	public int getMnu_order() {
		return mnu_order;
	}

	public void setMnu_order(int mnu_order) {
		this.mnu_order = mnu_order;
	}

	public String getMnu_no() {
		return mnu_no;
	}

	public void setMnu_no(String mnu_no) {
		this.mnu_no = mnu_no;
	}

	public String getMnu_detail_show_yn() {
		return mnu_detail_show_yn;
	}

	public void setMnu_detail_show_yn(String mnu_detail_show_yn) {
		this.mnu_detail_show_yn = mnu_detail_show_yn;
	}

	public String getMnu_detail_gb() {
		return mnu_detail_gb;
	}

	public void setMnu_detail_gb(String mnu_detail_gb) {
		this.mnu_detail_gb = mnu_detail_gb;
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
		return "MNU_DETAIL_MGT [mnu_gb=" + mnu_gb + ", mnu_detail_depth=" + mnu_detail_depth
				+ ", mnu_detail_description=" + mnu_detail_description + ", mnu_order=" + mnu_order + ", mnu_no="
				+ mnu_no + ", mnu_detail_show_yn=" + mnu_detail_show_yn + ", mnu_detail_gb=" + mnu_detail_gb
				+ ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
