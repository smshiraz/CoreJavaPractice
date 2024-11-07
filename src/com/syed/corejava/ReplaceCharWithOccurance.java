package com.syed.corejava;

import java.util.Arrays;

//Program to replace the given character with the occurance in the given string.
//Example OPENTEXT, replace T with its occurance 
//Output OPEN1EX2
public class ReplaceCharWithOccurance {

	public static void main(String[] args) {
		
		String input="OPENTEXT";
		char charToReplace='T';
		
		if(input.indexOf(charToReplace)== -1)
		{
			System.out.println("Given char not Available in the String");
			System.exit(0);
		}
		
		char arr[]=input.toCharArray();
		int ctr=1;
		for(int i=0;i<arr.length;i++)
         {
	        if(arr[i]==charToReplace)
	        {
	        	arr[i]=String.valueOf(ctr).charAt(0);
	        	ctr++;
	        }
          }
		System.out.println(Arrays.toString(arr));
		
	}

}
