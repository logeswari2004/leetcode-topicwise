class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        // Loop through the array, and calculate profit
        for (int i = 1; i < prices.length; i++) {
            // If the price on day i is greater than the price on day i-1
            if (prices[i] > prices[i - 1]) {
                // Add the difference to the maxProfit
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
}