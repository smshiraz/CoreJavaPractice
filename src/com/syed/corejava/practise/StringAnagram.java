package com.syed.corejava.practise;

import java.util.Arrays;

public class StringAnagram {
	
public static void main(String[] args) {
	String s1="zxy";
	String s2="xyz";
	
	if(s1.length()!= s2.length())
	{
		System.out.println("Not anagram");
	}
	else
	{		
	char chararr1[]=s1.toLowerCase().toCharArray();
	char chararr2[]=s2.toLowerCase().toCharArray();
	Arrays.sort(chararr1);
	Arrays.sort(chararr2);
	
	if(Arrays.equals(chararr1, chararr2))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");	
	}
	
	}
	

}
}

