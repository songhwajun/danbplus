package com.danbplus.vo.common;

import java.sql.Timestamp;

public class LOG_UPD {
	private int mgr_no;			// 수정자의 사원번호
	private String mapper_id;   // mapper_id
	private String log_gb;      // 적재 구분
	private Timestamp upd_dt;   // 수정일
	
	public LOG_UPD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LOG_UPD(int mgr_no, String mapper_id, String log_gb, Timestamp upd_dt) {
		super();
		this.mgr_no = mgr_no;
		this.mapper_id = mapper_id;
		this.log_gb = log_gb;
		this.upd_dt = upd_dt;
	}

	public int getMgr_no() {
		return mgr_no;
	}

	public void setMgr_no(int mgr_no) {
		this.mgr_no = mgr_no;
	}

	public String getMapper_id() {
		return mapper_id;
	}

	public void setMapper_id(String mapper_id) {
		this.mapper_id = mapper_id;
	}

	public String getLog_gb() {
		return log_gb;
	}

	public void setLog_gb(String log_gb) {
		this.log_gb = log_gb;
	}

	public Timestamp getUpd_dt() {
		return upd_dt;
	}

	public void setUpd_dt(Timestamp upd_dt) {
		this.upd_dt = upd_dt;
	}

	@Override
	public String toString() {
		return "LOG_UPD [mgr_no=" + mgr_no + ", mapper_id=" + mapper_id + ", log_gb=" + log_gb + ", upd_dt=" + upd_dt + "]";
	}
}
