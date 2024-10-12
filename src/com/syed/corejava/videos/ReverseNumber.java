package com.syed.corejava.videos;

public class ReverseNumber {
	public static void main(String[] args) {
     // input= 12345 output=54321
		int no=12345;
		int temp=0;
		int revNo=0;
		
		while(no>0)
		{
			temp=no%10;
			revNo=(revNo*10)+temp;
			no=no/10;
		}
		System.out.println(revNo);
		
	
	}
}
