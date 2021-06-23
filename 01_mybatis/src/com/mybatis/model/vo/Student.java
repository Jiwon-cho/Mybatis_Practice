package com.mybatis.model.vo;

import java.util.Date;

public class Student {
	private int studentNo;
	private String studentName;
	private String StudentTel;
	private String StudentAddr;
	private String StudentEmail;
	private Date reg_date;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNo, String studentName, String studentTel, String studentAddr, String studentEmail,
			Date reg_date) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		StudentTel = studentTel;
		StudentAddr = studentAddr;
		StudentEmail = studentEmail;
		this.reg_date = reg_date;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentTel() {
		return StudentTel;
	}
	public void setStudentTel(String studentTel) {
		StudentTel = studentTel;
	}
	public String getStudentAddr() {
		return StudentAddr;
	}
	public void setStudentAddr(String studentAddr) {
		StudentAddr = studentAddr;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", StudentTel=" + StudentTel
				+ ", StudentAddr=" + StudentAddr + ", StudentEmail=" + StudentEmail + ", reg_date=" + reg_date + "]";
	}
	
	
	
	
}
