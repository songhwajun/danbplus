package com.danbplus.vo.user;

import java.sql.Timestamp;

public class VACATION_MGT {
	
	private int usr_no;							// »ç¿ø¹øÈ£
	private float usr_vacation_carried_forward; // ÀÌ¿ùµÈ ÈÞ°¡
	private float usr_used_vacation;            // ÀÜ¿© ÈÞ°¡
	private float usr_total_vacation;           // ÃÑ ÈÞ°¡
	private String reg_nm;                      // µî·ÏÀÚ
	private Timestamp reg_dt;                   // µî·ÏÀÏ
	
	public VACATION_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VACATION_MGT(int usr_no, float usr_vacation_carried_forward, float usr_used_vacation,
			float usr_total_vacation, String reg_nm, Timestamp reg_dt) {
		super();
		this.usr_no = usr_no;
		this.usr_vacation_carried_forward = usr_vacation_carried_forward;
		this.usr_used_vacation = usr_used_vacation;
		this.usr_total_vacation = usr_total_vacation;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public int getUsr_no() {
		return usr_no;
	}

	public void setUsr_no(int usr_no) {
		this.usr_no = usr_no;
	}

	public float getUsr_vacation_carried_forward() {
		return usr_vacation_carried_forward;
	}

	public void setUsr_vacation_carried_forward(float usr_vacation_carried_forward) {
		this.usr_vacation_carried_forward = usr_vacation_carried_forward;
	}

	public float getUsr_used_vacation() {
		return usr_used_vacation;
	}

	public void setUsr_used_vacation(float usr_used_vacation) {
		this.usr_used_vacation = usr_used_vacation;
	}

	public float getUsr_total_vacation() {
		return usr_total_vacation;
	}

	public void setUsr_total_vacation(float usr_total_vacation) {
		this.usr_total_vacation = usr_total_vacation;
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
		return "VACATION_MGT [usr_no=" + usr_no + ", usr_vacation_carried_forward=" + usr_vacation_carried_forward
				+ ", usr_used_vacation=" + usr_used_vacation + ", usr_total_vacation=" + usr_total_vacation
				+ ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt + "]";
	}
}
