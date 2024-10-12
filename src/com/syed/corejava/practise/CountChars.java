package com.syed.corejava.practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountChars {

	public static void main(String[] args) {
		String str="syed hmustafa hh";
		str=str.replace(" ","").toLowerCase();//iloveindia
		
		Map<Character,Integer> map= new HashMap();	
		
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(map.containsKey(c))
			{
				int count=map.get(c);
				map.put(c, count+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		Set<Character> keys= map.keySet();
		
		Iterator<Character> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			char ch= iterator.next();
			int charCount=map.get(ch);
			System.out.println(ch + "is repeated " + charCount + "Times");
		}
		
		
		
		
	
	}

}
