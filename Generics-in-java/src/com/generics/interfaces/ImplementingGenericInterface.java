package com.generics.interfaces;
import com.java.generics.student.Student;

class ImplGenericInterface<StudentDTO> implements GenericInterface<StudentDTO> {
	 Student student = new Student();


	@Override
	public void setT(StudentDTO t) {
	 student.integratingAllClassesTogethr();
		
	}

	@Override
	public StudentDTO getT() {
		// TODO Auto-generated method stub
		return (StudentDTO) new Student();
	}

	
}