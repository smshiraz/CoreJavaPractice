package com.syed.corejava;

public class Fibonacci {
   // 0,1,1,2,3,5,8,13....
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=0;
		System.out.println(a);
		System.out.println(b);		
		while(count<10)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			count++;
		}

	}

}
