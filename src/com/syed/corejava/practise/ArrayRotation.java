package com.syed.corejava.practise;

import java.util.Arrays;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int noOfRot=3;
		System.out.println("Initial array "+Arrays.toString(arr));
		for(int i=0;i<noOfRot;i++)
		{
		arr=arrRotation(arr);
		}
		System.out.println("After Rotaion "+Arrays.toString(arr));
	}
	
	static int[] arrRotation(int arr[])
	{
		int start=arr[0];
		int length =arr.length-1;
		int x=1;
		while(x<=length)
		{
			arr[x-1]=arr[x];
			x++;
		}
		arr[length]=start;
		return arr;
	}

}
