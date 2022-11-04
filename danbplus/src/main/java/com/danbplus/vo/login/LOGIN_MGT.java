package com.danbplus.vo.login;

import java.sql.Timestamp;

public class LOGIN_MGT {
	private String usr_id;			   // 아이디
	private String usr_pw;             // 비밀번호
	private Timestamp last_login_dt;   // 마지막 로그인 일자
	private String pw_err_cnt;         // 비밀번호 오류횟수
	private Timestamp pw_upd_dt;       // 비밀번호 변경일
	
	public LOGIN_MGT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LOGIN_MGT(String usr_id, String usr_pw, Timestamp last_login_dt, String pw_err_cnt, Timestamp pw_upd_dt) {
		super();
		this.usr_id = usr_id;
		this.usr_pw = usr_pw;
		this.last_login_dt = last_login_dt;
		this.pw_err_cnt = pw_err_cnt;
		this.pw_upd_dt = pw_upd_dt;
	}

	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}

	public String getUsr_pw() {
		return usr_pw;
	}

	public void setUsr_pw(String usr_pw) {
		this.usr_pw = usr_pw;
	}

	public Timestamp getLast_login_dt() {
		return last_login_dt;
	}

	public void setLast_login_dt(Timestamp last_login_dt) {
		this.last_login_dt = last_login_dt;
	}

	public String getPw_err_cnt() {
		return pw_err_cnt;
	}

	public void setPw_err_cnt(String pw_err_cnt) {
		this.pw_err_cnt = pw_err_cnt;
	}

	public Timestamp getPw_upd_dt() {
		return pw_upd_dt;
	}

	public void setPw_upd_dt(Timestamp pw_upd_dt) {
		this.pw_upd_dt = pw_upd_dt;
	}

	@Override
	public String toString() {
		return "LOGIN_MGT [usr_id=" + usr_id + ", usr_pw=" + usr_pw + ", last_login_dt=" + last_login_dt
				+ ", pw_err_cnt=" + pw_err_cnt + ", pw_upd_dt=" + pw_upd_dt + "]";
	}
}
