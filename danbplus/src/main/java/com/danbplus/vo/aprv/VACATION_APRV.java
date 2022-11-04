package com.danbplus.vo.aprv;

import java.sql.Timestamp;

public class VACATION_APRV {
	private int aprv_no;		// �������� �����ȣ
	private String vac_no;      // �ް���ȣ
	private String aprv_reason; // �ް� ����/�ݷ�����
	private String reg_nm;      // �����
	private Timestamp reg_dt;   // �����
	
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