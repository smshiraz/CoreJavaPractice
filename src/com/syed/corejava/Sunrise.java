package com.syed.corejava;

//Given an array H representing heights of buildings.
//You have to count the buildings which will see the sunrise 
//(Assume : Sun rise on the side of array starting point)
//2,4,3,4,6
//-4,-3,-2,-1
public class Sunrise {

	public static void main(String[] args) {
  int arrOfHeight[]= {-4,-3,2,-1};
  int count=countOfBuilding(arrOfHeight);
  System.out.println(count+ " buildings can see the sunrise");
  }

	static int countOfBuilding(int arr[]) {

		int length = arr.length;
		int count = 0;
		int max = 0;
		for (int i = 0; i <length; i++) {
			if(arr[i]<0)
			{
				continue;
			}
			if (arr[i] > max) {
          count++;
          max=arr[i];
			}
		}
		return count;
	}

}