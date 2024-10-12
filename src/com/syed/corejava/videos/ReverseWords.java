package com.syed.corejava.videos;

public class ReverseWords {
	
	public static void main(String[] args) {
        String str="i love my India";
        String strArray[]=str.split(" ");
        int length=strArray.length;
        for(int i=length-1;i>=0;i--)
        {
        	System.out.print(strArray[i]+" ");
        }
        
        
        
        

	}

}
