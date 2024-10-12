package com.syed.corejava;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = {2,4,6,1};
		Arrays.sort(arr);
		int res=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(res==arr[i])
			{
				res++;
			}
			else
			{
				System.out.println(res + "is the missing no");
				break;
			}
		}
		}
}
