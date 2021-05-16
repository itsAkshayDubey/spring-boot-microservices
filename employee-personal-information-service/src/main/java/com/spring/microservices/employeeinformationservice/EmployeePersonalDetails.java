package com.spring.microservices.employeeinformationservice;

public class EmployeePersonalDetails {
	private int empID;
	private String dob;
	private String address;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmployeePersonalDetails(int empID, String dob, String address) {
		super();
		this.empID = empID;
		this.dob = dob;
		this.address = address;
	}
	public EmployeePersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
