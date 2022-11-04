package com.danbplus.vo.common;

import java.sql.Timestamp;

public class COD_DETAIL_MGT {
	private String cod_gb;					// 코드 구분
	private String cod_detail_depth;        // 코드 상세 depth
	private String cod_detail_description;  // 코드 상세설명
	private int cod_order;               	// 코드 순서
	private String cod_no;                  // 코드 번호
	private String cod_detail_gb;           // 코드 상세구분
	private String reg_nm;                  // 등록자
	private Timestamp reg_dt;               // 등록일
	
	public COD_DETAIL_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public COD_DETAIL_MGT(String cod_gb, String cod_detail_depth, String cod_detail_description, int cod_order,
			String cod_no, String cod_detail_gb, String reg_nm, Timestamp reg_dt) {
		super();
		this.cod_gb = cod_gb;
		this.cod_detail_depth = cod_detail_depth;
		this.cod_detail_description = cod_detail_description;
		this.cod_order = cod_order;
		this.cod_no = cod_no;
		this.cod_detail_gb = cod_detail_gb;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getCod_gb() {
		return cod_gb;
	}

	public void setCod_gb(String cod_gb) {
		this.cod_gb = cod_gb;
	}

	public String getCod_detail_depth() {
		return cod_detail_depth;
	}

	public void setCod_detail_depth(String cod_detail_depth) {
		this.cod_detail_depth = cod_detail_depth;
	}

	public String getCod_detail_description() {
		return cod_detail_description;
	}

	public void setCod_detail_description(String cod_detail_description) {
		this.cod_detail_description = cod_detail_description;
	}

	public int getCod_order() {
		return cod_order;
	}

	public void setCod_order(int cod_order) {
		this.cod_order = cod_order;
	}

	public String getCod_no() {
		return cod_no;
	}

	public void setCod_no(String cod_no) {
		this.cod_no = cod_no;
	}

	public String getCod_detail_gb() {
		return cod_detail_gb;
	}

	public void setCod_detail_gb(String cod_detail_gb) {
		this.cod_detail_gb = cod_detail_gb;
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
		return "COD_DETAIL_MGT [cod_gb=" + cod_gb + ", cod_detail_depth=" + cod_detail_depth
				+ ", cod_detail_description=" + cod_detail_description + ", cod_order=" + cod_order + ", cod_no="
				+ cod_no + ", cod_detail_gb=" + cod_detail_gb + ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}