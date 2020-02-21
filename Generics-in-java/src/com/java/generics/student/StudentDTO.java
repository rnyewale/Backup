package com.java.generics.student;

import java.util.*;

public class StudentDTO {

	private String studentId;
	
	private String studentName;
	
	private String standard;
	
	private List<StudentReport> studentReport;

	public StudentDTO() {
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public List<StudentReport> getStudentReport() {
		return studentReport;
	}

	public void setStudentReport(List<StudentReport> studentReport) {
		this.studentReport = studentReport;
	}
	
	
}
