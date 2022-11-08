package com.danbplus.config.vo;

import java.sql.Timestamp;
import java.util.Date;

public class USER_INFO {
	private int usr_no;						// 사원번호
	private String usr_id;                  // 아이디
	private String usr_team;                // 소속
	private String usr_rank;                // 직급
	private String usr_grade;               // 등급
	private String usr_nm;                  // 이름
	private Date usr_birthday ;             // 생년월일
	private String usr_email;               // 개인 이메일
	private String usr_email2;              // 사내 이메일
	private String usr_phone;               // 휴대폰번호
	private String usr_gender;              // 성별
	private Date usr_company_start_work;    // 입사일
	private Date usr_permanent_employee;    // 정규직 전환일
	private String reg_nm;                  // 등록자
	private Timestamp reg_dt;               // 등록일
	
	public USER_INFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public USER_INFO(int usr_no, String usr_id, String usr_team, String usr_rank, String usr_grade, String usr_nm,
			Date usr_birthday, String usr_email, String usr_email2, String usr_phone, String usr_gender,
			Date usr_company_start_work, Date usr_permanent_employee, String reg_nm, Timestamp reg_dt) {
		super();
		this.usr_no = usr_no;
		this.usr_id = usr_id;
		this.usr_team = usr_team;
		this.usr_rank = usr_rank;
		this.usr_grade = usr_grade;
		this.usr_nm = usr_nm;
		this.usr_birthday = usr_birthday;
		this.usr_email = usr_email;
		this.usr_email2 = usr_email2;
		this.usr_phone = usr_phone;
		this.usr_gender = usr_gender;
		this.usr_company_start_work = usr_company_start_work;
		this.usr_permanent_employee = usr_permanent_employee;
		this.reg_nm = reg_nm;
		this.reg_dt = reg_dt;
	}

	public int getUsr_no() {
		return usr_no;
	}

	public void setUsr_no(int usr_no) {
		this.usr_no = usr_no;
	}

	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}

	public String getUsr_team() {
		return usr_team;
	}

	public void setUsr_team(String usr_team) {
		this.usr_team = usr_team;
	}

	public String getUsr_rank() {
		return usr_rank;
	}

	public void setUsr_rank(String usr_rank) {
		this.usr_rank = usr_rank;
	}

	public String getUsr_grade() {
		return usr_grade;
	}

	public void setUsr_grade(String usr_grade) {
		this.usr_grade = usr_grade;
	}

	public String getUsr_nm() {
		return usr_nm;
	}

	public void setUsr_nm(String usr_nm) {
		this.usr_nm = usr_nm;
	}

	public Date getUsr_birthday() {
		return usr_birthday;
	}

	public void setUsr_birthday(Date usr_birthday) {
		this.usr_birthday = usr_birthday;
	}

	public String getUsr_email() {
		return usr_email;
	}

	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}

	public String getUsr_email2() {
		return usr_email2;
	}

	public void setUsr_email2(String usr_email2) {
		this.usr_email2 = usr_email2;
	}

	public String getUsr_phone() {
		return usr_phone;
	}

	public void setUsr_phone(String usr_phone) {
		this.usr_phone = usr_phone;
	}

	public String getUsr_gender() {
		return usr_gender;
	}

	public void setUsr_gender(String usr_gender) {
		this.usr_gender = usr_gender;
	}

	public Date getUsr_company_start_work() {
		return usr_company_start_work;
	}

	public void setUsr_company_start_work(Date usr_company_start_work) {
		this.usr_company_start_work = usr_company_start_work;
	}

	public Date getUsr_permanent_employee() {
		return usr_permanent_employee;
	}

	public void setUsr_permanent_employee(Date usr_permanent_employee) {
		this.usr_permanent_employee = usr_permanent_employee;
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
		return "USER_INFO [usr_no=" + usr_no + ", usr_id=" + usr_id + ", usr_team=" + usr_team + ", usr_rank="
				+ usr_rank + ", usr_grade=" + usr_grade + ", usr_nm=" + usr_nm + ", usr_birthday=" + usr_birthday
				+ ", usr_email=" + usr_email + ", usr_email2=" + usr_email2 + ", usr_phone=" + usr_phone
				+ ", usr_gender=" + usr_gender + ", usr_company_start_work=" + usr_company_start_work
				+ ", usr_permanent_employee=" + usr_permanent_employee + ", reg_nm=" + reg_nm + ", reg_dt=" + reg_dt
				+ "]";
	}
}
