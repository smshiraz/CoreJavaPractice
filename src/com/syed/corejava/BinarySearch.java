package com.syed.corejava;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int arr[] = { 2, 6, 7, 9, 12, 17 };
		int ind = -1;
		int l = arr.length;
		int notosearch = 6;
		int start = 0;
		int end = l - 1;
		while (start <= end) {

			int temp = (start + end) / 2;
			if (arr[temp] == notosearch) {
				ind = temp;
				break;
			} else if (arr[temp] < notosearch) {
				start = temp + 1;

			} else {
				end = end - 1;
			}
		}
		
		if(ind==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("found at index " +ind);
		}
	}

}
