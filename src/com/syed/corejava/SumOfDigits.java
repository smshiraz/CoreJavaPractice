package com.syed.corejava;

public class SumOfDigits {
public static void main(String[] args) {
	int no=12345;
	int temp=0;
	int sum=0;
	while(no>0)
	{
		temp=no%10;
		sum=sum+temp;
		no=no/10;
	}
	System.out.println(sum);
	
}
}
