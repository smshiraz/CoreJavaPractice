package com.syed.corejava;

public class LengthOfLAstWord {
	public static void main(String[] args) {
		String str="i love india";
		String strArr[]=str.split(" ");
		int arrlength=strArr.length;
		int lstWordLength= strArr[arrlength-1].length();
		System.out.println(lstWordLength);
	}
	

}
