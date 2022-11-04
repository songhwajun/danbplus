package com.danbplus.vo.common;

import java.sql.Timestamp;

public class MNU_MGT {
	private String mnu_gb;			// �޴� ����
	private String mnu_depth;       // �޴� depth
	private String mnu_description; // �޴� ����
	private String mnu_show_yn;     // �޴� ����YN
	private String reg_nm;          // �����
	private Timestamp reg_dt;       // �����
	
	public MNU_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MNU_MGT(String mnu_gb, String mnu_depth, String mnu_description, String mnu_show_yn, String reg_nm,
			Timestamp reg_dt) {
		super();
		this.mnu_gb = mnu_gb;
		this.mnu_depth = mnu_depth;
		this.mnu_description = mnu_description;
		this.mnu_show_yn = mnu_show_yn;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getMnu_gb() {
		return mnu_gb;
	}

	public void setMnu_gb(String mnu_gb) {
		this.mnu_gb = mnu_gb;
	}

	public String getMnu_depth() {
		return mnu_depth;
	}

	public void setMnu_depth(String mnu_depth) {
		this.mnu_depth = mnu_depth;
	}

	public String getMnu_description() {
		return mnu_description;
	}

	public void setMnu_description(String mnu_description) {
		this.mnu_description = mnu_description;
	}

	public String getMnu_show_yn() {
		return mnu_show_yn;
	}

	public void setMnu_show_yn(String mnu_show_yn) {
		this.mnu_show_yn = mnu_show_yn;
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
		return "MNU_MGT [mnu_gb=" + mnu_gb + ", mnu_depth=" + mnu_depth + ", mnu_description=" + mnu_description
				+ ", mnu_show_yn=" + mnu_show_yn + ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
