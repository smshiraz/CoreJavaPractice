package com.syed.corejava;


/*
 You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
 in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 

 */
public class StockMaxProfit {

	public static void main(String[] args) {
		StockMaxProfit obj= new StockMaxProfit();
		int arr[]= {7,1,5,3,6,4};
		System.out.println(obj.buySell(arr));

	}
	
	
	int buySell(int prices[])
	{
		int minPrice=prices[0];
		int profit=0;
		for(int i=0;i<prices.length;i++)
		{
			profit=Math.max(profit, prices[i]-minPrice);
			minPrice=Math.min(minPrice,prices[i]);
		}
		return profit;
	}

}
