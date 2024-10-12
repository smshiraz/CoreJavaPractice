package com.syed.corejava;

import java.util.Arrays;
import java.util.Stack;

//https://www.youtube.com/watch?v=Ff6S4qOdSVQ
//list = [ 4 , 10 , 5 , 8 , 20 , 15 , 3 , 12]
//result = [-1 , 4 , 4 , 5 , 8 , 8 , -1 , 3] 
public class NearestNumberonLeft {
	
	public static void main(String[] args) {
		int arr[]= { 4 , 10 , 5 , 8 , 20 , 15 , 3 , 12};
		int ans[] = new int[arr.length];
		Stack<Integer> stack= new Stack<>();
		ans[0]=-1;
		stack.push(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			while(stack.size()>0 && stack.peek()>=arr[i])
			{
				stack.pop();
			}
			if(stack.size()==0)
			{
				ans[i]=-1;
			}
			else
			{
				ans[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}
	

}
