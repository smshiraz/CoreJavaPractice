

package com.syed.corejava;

public class SeparateOddEvenNoArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j)
		{
			while(arr[i]%2==0)
			{
				i++;
			}
			while(arr[j]%2!=0)
			{
				j--;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		for(int a: arr)
		{
			System.out.print(a);
		}
	}

}
