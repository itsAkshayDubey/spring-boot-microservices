package com.spring.microservices.employeeratingsservice;

public class EmployeeRating {
	private int empID;
	private String rating;
	private String grade;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public EmployeeRating(int empID, String rating, String grade) {
		super();
		this.empID = empID;
		this.rating = rating;
		this.grade = grade;
	}
	public EmployeeRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
