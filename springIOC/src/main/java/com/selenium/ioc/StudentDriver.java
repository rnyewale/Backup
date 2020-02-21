package com.selenium.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructor.injection.Employee;
import com.object.injection.StudentImplMathCheat;

public class StudentDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("studentBean.xml");

		Student student = (Student) context.getBean("student");

		Employee employee = context.getBean("employee", Employee.class);

		StudentImplMathCheat mathCheat = context.getBean("cheat", StudentImplMathCheat.class);

		System.out.println("================== Dependency Injection using Setter Injection ==================");

		System.out.println("Student Name: " + student.getStudName());
		System.out.println("Student Id: " + student.getStudId());

		employee.displayInfo();
		mathCheat.displayMathCheatDataFromStudent();
	}

}
