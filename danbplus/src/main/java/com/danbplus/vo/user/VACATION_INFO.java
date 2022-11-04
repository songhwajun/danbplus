package com.danbplus.vo.user;

import java.sql.Timestamp;
import java.util.Date;

public class VACATION_INFO {
	private String vac_no;		// 휴가번호
	private int usr_no;         // 사원번호
	private String usr_vac;     // 휴가구분
	private Date vac_start_dt;  // 휴가 시작일
	private Date vac_end_dt;    // 휴가 종료일
	private String vac_reason;  // 휴가 사유
	private String reg_nm;      // 등록자
	private Timestamp reg_dt;   // 등록일
	
	public VACATION_INFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VACATION_INFO(String vac_no, int usr_no, String usr_vac, Date vac_start_dt, Date vac_end_dt,
			String vac_reason, String reg_nm, Timestamp reg_dt) {
		super();
		this.vac_no = vac_no;
		this.usr_no = usr_no;
		this.usr_vac = usr_vac;
		this.vac_start_dt = vac_start_dt;
		this.vac_end_dt = vac_end_dt;
		this.vac_reason = vac_reason;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public String getVac_no() {
		return vac_no;
	}

	public void setVac_no(String vac_no) {
		this.vac_no = vac_no;
	}

	public int getUsr_no() {
		return usr_no;
	}

	public void setUsr_no(int usr_no) {
		this.usr_no = usr_no;
	}

	public String getUsr_vac() {
		return usr_vac;
	}

	public void setUsr_vac(String usr_vac) {
		this.usr_vac = usr_vac;
	}

	public Date getVac_start_dt() {
		return vac_start_dt;
	}

	public void setVac_start_dt(Date vac_start_dt) {
		this.vac_start_dt = vac_start_dt;
	}

	public Date getVac_end_dt() {
		return vac_end_dt;
	}

	public void setVac_end_dt(Date vac_end_dt) {
		this.vac_end_dt = vac_end_dt;
	}

	public String getVac_reason() {
		return vac_reason;
	}

	public void setVac_reason(String vac_reason) {
		this.vac_reason = vac_reason;
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
		return "VACATION_MGT [vac_no=" + vac_no + ", usr_no=" + usr_no + ", usr_vac=" + usr_vac + ", vac_start_dt="
				+ vac_start_dt + ", vac_end_dt=" + vac_end_dt + ", vac_reason=" + vac_reason + ", reg_nm=" + reg_nm
				+ ", reg_dt=" + reg_dt + "]";
	}
}
