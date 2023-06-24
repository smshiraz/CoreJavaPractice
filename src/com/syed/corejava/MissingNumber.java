package com.syed.corejava;

public class MissingNumber {
	public static void main(String[] args) {
		int nums[] = {-1,1,3,4};
		int prev=nums[0];
		int min=0;
		int max=nums.length-1;	
		while(min<max)
		{
			if(nums[min+1]!=prev+1)
			{
				int sum=nums[min]+1;
				System.out.println("The missing no is "+sum);
			break;
			}
			min++;
			prev=nums[min];
		}
		}
}
