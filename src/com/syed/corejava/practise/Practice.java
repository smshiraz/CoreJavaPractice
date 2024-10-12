package com.syed.corejava.practise;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
		Student s1= new Student(1,"Sachin", 89);
		Student s2= new Student(2,"Kohli", 100);
		Student s3 =new Student(2,"Kohli", 100);
		
		Map<Student,String> map= new HashMap();
		map.put(s1, "Value1");
		map.put(s2, "VAlue2");
		map.put(s3, "VAlue3");
		
		System.out.println(map);
		
		
	}

	
	
}
