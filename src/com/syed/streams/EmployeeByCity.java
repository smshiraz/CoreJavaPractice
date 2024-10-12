 

package com.syed.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByCity {
	public static void main(String[] args) {

		List<Employee1> employeeList = new ArrayList<>();

		employeeList.add(new Employee1("David", "Paris", 23));
		employeeList.add(new Employee1("Arun", "Delhi", 24));
		employeeList.add(new Employee1("Sam", "Bombay", 56));
		employeeList.add(new Employee1("Ram", "Paris", 45));
		employeeList.add(new Employee1("Hari", "Delhi", 23));
		employeeList.add(new Employee1("Tom", "Bombay", 83));
		employeeList.add(new Employee1("Sean", "Guwahati", 23));

		Map<String, List<Employee1>> employeeByCity = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getEmpCity));

		System.out.println(employeeByCity);

	}
}

class Employee1 
{
	private String empName;
	private String empCity;
	private int age;
	public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "Employee1 [empName=" + empName + ", empCity=" + empCity + ", age=" + age + "]"+"\n";
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee1(String empName, String empCity, int age) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.age = age;
	}
	
	
	
}