
package com.syed.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateWords {
 public static void main(String[] args) {
	findDuplicateWords("I am am learning java java java");
}

 private static void findDuplicateWords(String str) {
	
	Map<String,Integer> hm= new HashMap<>();
	String strArray[]=str.split(" ");
	for(int i=0;i<strArray.length;i++)
	{
		if(hm.get(strArray[i])!=null)
		{
			int count=hm.get(strArray[i])+1;
			hm.put(strArray[i], count);
		}
		else
		{
			hm.put(strArray[i],1);
		}
		
	}
	Iterator<String> i=hm.keySet().iterator();
	while(i.hasNext())
	{
		String temp=i.next();
		if(hm.get(temp)>1)
		{
			System.out.println(temp +" appears "+hm.get(temp)+" no of times");
		}
	}
	
}


}
