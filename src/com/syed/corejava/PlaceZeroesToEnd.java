package com.syed.corejava;

import java.util.Arrays;

//https://www.youtube.com/watch?v=AgiGd763srg
public class PlaceZeroesToEnd {
	
	public static void main(String ar[])
	{
		
		int arr[]= {6,0,1,0,0,3,1,2};
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
