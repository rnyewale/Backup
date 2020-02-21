package com.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DriverClass {

	static List<Employee> employeeList = ListOfEmpolyees.elpoyeeList();

	public static void main(String[] args) {
		System.out.println(
				" *************************Total no of Male & Female in the Organization: *************************");
		totalMaleAndFemaleEmployees();

		System.out.println(" *************************List of Departments:  *************************");
		printAllDepartments();

		System.out.println(" *************************Avg. age of male and female employees *************************");
		displayAvgAgeOfMaleAndFemaleEmployee();

		System.out.println();
		getHighestPaidEmployeeDetail();

		System.out.println(
				" *************************Get the names of all employees who have joined after 2015 *************************");
		dateOfJoiningAfter();

		System.out.println(
				" *************************Count the number of employees in each department ************************* ");
		countTheEmpInEachDepartment();

		System.out.println("*************Average salary of Each department: *************************");
		avgSalaryOfEachDept();
	}

	public static void totalMaleAndFemaleEmployees() {
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("\n " + noOfMaleAndFemaleEmployees);
	}

	public static void printAllDepartments() {
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	// What is the average age of male and female employees?
	public static void displayAvgAgeOfMaleAndFemaleEmployee() {
		Map<String, Double> avgAgeOfMaleAndFemaleEmployeesMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployeesMap);
	}

	// Get the details of highest paid employee in the organization
	public static void getHighestPaidEmployeeDetail() {
		Optional<Employee> heghestPaidEmp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee heigestPaidEmployee = heghestPaidEmp.get();
		System.out.println("Details Of Highest Paid Employee : ");
		System.out.println("==================================");
		System.out.println("ID : " + heigestPaidEmployee.getId());
		System.out.println("Name : " + heigestPaidEmployee.getName());
		System.out.println("Age : " + heigestPaidEmployee.getAge());
		System.out.println("Gender : " + heigestPaidEmployee.getGender());
		System.out.println("Department : " + heigestPaidEmployee.getDepartment());
		System.out.println("Year Of Joining : " + heigestPaidEmployee.getYearOfJoining());
		System.out.println("Salary : " + heigestPaidEmployee.getSalary());
	}

	// Get the names of all employees who have joined after 2015
	public static void dateOfJoiningAfter() {
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
	}

	public static void countTheEmpInEachDepartment() {
		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// What is the average salary of each department?
	public static void avgSalaryOfEachDept() {
		Map<String, Double> avgSalaryOfEachDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrSet = avgSalaryOfEachDept.entrySet();
		for (Entry<String, Double> entry : entrSet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
