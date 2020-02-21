package com.constructor.injection;

public class Employee {

	private int empCode;
	private String empName;
	
	public Employee(int empCode, String empName) {
		super();
		this.empCode = empCode;
		this.empName = empName;
	}
	
	public void displayInfo() {
		System.out.println("================ Employee Details Using Constructor Injection =================");
		System.out.println("Employee Code: "+empCode);
		System.out.println("Employee Name: "+empName);
	}
}
