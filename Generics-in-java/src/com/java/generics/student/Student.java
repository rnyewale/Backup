package com.java.generics.student;

import java.util.*;

import com.java.generics.TwoGenericsInClass;

public class Student {
	
	public Student() {}
	
	public void integratingAllClassesTogethr() {
		StudentDTO  dto = new StudentDTO();
		
		StudentSubjects studentSubjects = new StudentSubjects();
		List<StudentSubjects> studentList= new ArrayList();		
		studentSubjects.setComputers("Java Technology");
		studentSubjects.setArtsAndScience("Sociology");
		studentSubjects.setEconomics("Current Afairs");
		studentSubjects.setEnglish("English");
		studentSubjects.setMath("Algebra and Statistics");
		studentList.add(studentSubjects);
		
		StudentReport report = new StudentReport();
		List<StudentReport> reportList = new ArrayList<StudentReport>();
		
		report.setMarks(86);
		report.setGetSubjects(studentList);
		reportList.add(report);
		
		dto.setStandard("12th Standard (XII)");
		dto.setStudentId("2411");
		dto.setStudentName("Albert Dane");
		dto.setStudentReport(reportList);
		report.setId(dto.getStudentId());
		System.out.println(dto.getStudentId()+"\t"+dto.getStandard()+"\t"+dto.getStudentName());
		
		for(StudentReport list : dto.getStudentReport())
			System.out.println(list.getId()+"\t"+list.getMarks());
		for(StudentSubjects sbl : studentList)
			System.out.println(sbl.getArtsAndScience()+"\t"+sbl.getComputers()+"\t"+sbl.getEconomics()+"\t"+sbl.getEnglish()+"\t"+sbl.getMath());
	}

	public static void main(String[] args) {
		Student student = new  Student();
		student.integratingAllClassesTogethr();
		
		TwoGenericsInClass<Student, StudentReport> generics = new TwoGenericsInClass<Student, StudentReport>(new Student(), new StudentReport());
		generics.setT1(student);
		generics.setT2(new StudentReport());
		
		System.out.println(generics.getT1().getClass());
		System.out.println(generics.getT2().getClass());
	}

}
