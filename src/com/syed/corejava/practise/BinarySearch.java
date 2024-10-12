package com.syed.corejava.practise;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 7, 9, 12, 17 };
		
		int res=binarySearch(arr,6);
		if(res==-1)
			System.out.println("no lement found");
		else
			System.out.println("element found at index no "+res);
	}	
		
		
		
		
		static int binarySearch(int arr[],int notosearch)
		{
		int ind = -1;
		int l = arr.length-1;
		
		int i=0;
		
		while(i<=l)
		{
			int mid=(i+l)/2;
			System.out.println("mid="+mid);
			if(notosearch==arr[mid])
			{
				ind=mid;
				break;
			}
			else if(notosearch<arr[mid])
			{
				l=mid-1;
			}
			else
			{
				i=mid+1;
			}
		}
		return ind;
		
	}

}
