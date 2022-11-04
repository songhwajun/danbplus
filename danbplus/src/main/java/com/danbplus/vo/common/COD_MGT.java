package com.danbplus.vo.common;

import java.sql.Timestamp;

public class COD_MGT {
	private String cod_gb;			// 코드 구분
	private String cod_depth;       // 코드 depth
	private String cod_description; // 코드 설명
	private String reg_nm;          // 등록자
	private Timestamp reg_dt;       // 등록일
	
	public COD_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public COD_MGT(String cod_gb, String cod_depth, String cod_description, String reg_nm, Timestamp reg_dt) {
		super();
		this.cod_gb = cod_gb;
		this.cod_depth = cod_depth;
		this.cod_description = cod_description;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getCod_gb() {
		return cod_gb;
	}

	public void setCod_gb(String cod_gb) {
		this.cod_gb = cod_gb;
	}

	public String getCod_depth() {
		return cod_depth;
	}

	public void setCod_depth(String cod_depth) {
		this.cod_depth = cod_depth;
	}

	public String getCod_description() {
		return cod_description;
	}

	public void setCod_description(String cod_description) {
		this.cod_description = cod_description;
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
		return "COD_MGT [cod_gb=" + cod_gb + ", cod_depth=" + cod_depth + ", cod_description=" + cod_description
				+ ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
