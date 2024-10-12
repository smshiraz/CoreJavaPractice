package com.syed.corejava.practise;

import java.util.Arrays;

public class PlaceZeroesToEnd {

	public static void main(String[] args) {
		
		int arr[]= {6,0,1,0,0,3,1,2};
		
		int ctr=0;
		
		int length=arr.length;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]!=0)
			{
				arr[ctr]=arr[i];
				ctr++;
			}
		}
		
		while(ctr<length)
		{
			arr[ctr]=0;
			ctr++;
		}
System.out.println(Arrays.toString(arr));
		
		
		
	}

}
