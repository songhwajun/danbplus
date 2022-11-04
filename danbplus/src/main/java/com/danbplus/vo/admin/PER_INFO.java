package com.danbplus.vo.admin;

import java.sql.Timestamp;

public class PER_INFO {
	private int usr_no;			 // 사원번호
	private String mnu_gb;       // 메뉴 구분
	private String mnu_no;       // 메뉴 번호
	private String work_show_yn; // 업무 접근권한 YN
	private String reg_nm;       // 등록자
	private Timestamp reg_dt;    // 등록일
	
	public PER_INFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PER_INFO(int usr_no, String mnu_gb, String mnu_no, String work_show_yn, String reg_nm, Timestamp reg_dt) {
		super();
		this.usr_no = usr_no;
		this.mnu_gb = mnu_gb;
		this.mnu_no = mnu_no;
		this.work_show_yn = work_show_yn;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public int getUsr_no() {
		return usr_no;
	}

	public void setUsr_no(int usr_no) {
		this.usr_no = usr_no;
	}

	public String getMnu_gb() {
		return mnu_gb;
	}

	public void setMnu_gb(String mnu_gb) {
		this.mnu_gb = mnu_gb;
	}

	public String getMnu_no() {
		return mnu_no;
	}

	public void setMnu_no(String mnu_no) {
		this.mnu_no = mnu_no;
	}

	public String getWork_show_yn() {
		return work_show_yn;
	}

	public void setWork_show_yn(String work_show_yn) {
		this.work_show_yn = work_show_yn;
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
		return "PER_INFO [usr_no=" + usr_no + ", mnu_gb=" + mnu_gb + ", mnu_no=" + mnu_no + ", work_show_yn="
				+ work_show_yn + ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
