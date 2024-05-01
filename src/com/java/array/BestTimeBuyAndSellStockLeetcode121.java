package com.java.array;

public class BestTimeBuyAndSellStockLeetcode121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4 };
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int currentProfit = 0;
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			currentProfit = prices[i] - prices[i - 1];

			// if currentProfit less than or equal to 0 then profit will be 0
			if (!(currentProfit > 0)) {
				currentProfit = 0;
			}
			if (maxProfit < currentProfit)
				maxProfit = currentProfit;
		}
		return maxProfit;
	}

}
