package general;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minValue){
                minValue = prices[i];
            }
            if(prices[i] - minValue > maxProfit){
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}
