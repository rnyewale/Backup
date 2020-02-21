package com.java.generics.student;

import java.util.*;

public class StudentReport {

	private String id;
	
	private long marks;
	
	private List<StudentSubjects> getSubjects;

	public StudentReport() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<StudentSubjects> getGetSubjects() {
		return getSubjects;
	}

	public void setGetSubjects(List<StudentSubjects> getSubjects) {
		this.getSubjects = getSubjects;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}
}
