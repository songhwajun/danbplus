package com.danbplus.vo.aprv;

import java.sql.Timestamp;

public class VACATION_APRV {
	private int aprv_no;		// 승인자의 사원번호
	private String vac_no;      // 휴가번호
	private String aprv_reason; // 휴가 승인/반려사유
	private String reg_nm;      // 등록자
	private Timestamp reg_dt;   // 등록일
	
	public VACATION_APRV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VACATION_APRV(int aprv_no, String vac_no, String aprv_reason, String reg_nm, Timestamp reg_dt) {
		super();
		this.aprv_no = aprv_no;
		this.vac_no = vac_no;
		this.aprv_reason = aprv_reason;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public int getAprv_no() {
		return aprv_no;
	}

	public void setAprv_no(int aprv_no) {
		this.aprv_no = aprv_no;
	}

	public String getVac_no() {
		return vac_no;
	}

	public void setVac_no(String vac_no) {
		this.vac_no = vac_no;
	}

	public String getAprv_reason() {
		return aprv_reason;
	}

	public void setAprv_reason(String aprv_reason) {
		this.aprv_reason = aprv_reason;
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
		return "VACATION_APRV [aprv_no=" + aprv_no + ", vac_no=" + vac_no + ", aprv_reason=" + aprv_reason + ", reg_nm="
				+ reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}