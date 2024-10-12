package com.syed.corejava.practise;

public class Student {
	
	
	int rollNo;
	String Name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode()
	{
		return rollNo;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s=(Student) o;
		if(this.rollNo==s.getRollNo())
			return true;
		else
			return false;
		
	}
	

}
