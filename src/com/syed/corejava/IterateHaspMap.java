package com.syed.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHaspMap {

	public static void main(String[] args) {
		method1();
	//	method2();
	//	method3();
	//	method4();
		//method5();		
	}
	
	static void method1()
	{
		{ 
	        Map<String,String> xyz = new HashMap<String,String>(); 	         
	       //Enter value and url
	        xyz.put("xyz", "Alphabet.org"); 
	        xyz.put("Pronounce", "words.org"); 
	        
	        // using keySet() for iteration over keys 
	        for (String name : xyz.keySet())  
	            System.out.println("key: " + name); 
	            
	        // using values() for iteration over keys 
	        for (String url : xyz.values())  
	            System.out.println("value: " + url); 
	    } 
	}
	
	static void method2()
	{
		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Ajay");
		customers.put(2, "Barkha");
		customers.put(3, "Cathy");
		 
		System.out.println("Using foreach");
		customers.forEach((id, name) -> {
		System.out.println("Key : " + id + " value : " + name);
		});
	}
	
	
	private static void method3() {
		Map<Integer, String> students = new HashMap<>();
        students.put(1, "Anamika");
        students.put(2, "Bhaskar");
        students.put(3, "Rahul");
  
        System.out.println("");
        students.entrySet().stream().forEach(e ->
                System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
        );
		
	}
	
	
	private static void method4() {
		 Map<Integer, String> students = new HashMap<>();
	        students.put(1, "Anamika");
	        students.put(2, "Bob");
	        students.put(3, "Mary");
	  
	    for (Map.Entry<Integer, String> entry : students.entrySet()) {
	      System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
	    }
	  
		
	}
	
	private static void method5() {
		 Map<Integer, String> Students = new HashMap<>();
	        Students.put(1, "Anamika");
	        Students.put(2, "Bob");
	        Students.put(3, "Mary");
	  
	        Iterator<Entry<Integer, String>> iterator = Students.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry entry = iterator.next();
	            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
	        }
		
	}
	

}
