package com.example;

public class Student {

	private int rollNo;
	
	private String studentName;
	
	private double markScored;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String studentName, double markScored) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.markScored = markScored;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", markScored=" + markScored + "]";
	}
	
	
	
}
