class Solution {
    public int maxProfit(int[] prices) {
        int min_prices = Integer.MAX_VALUE;
        int max_prices = 0;

        for (int i = 0; i < prices.length; i++){
            min_prices = Math.min(min_prices, prices[i]);
            max_prices = Math.max(max_prices, (prices[i] - min_prices));
        }

        return max_prices;
    
    }
}