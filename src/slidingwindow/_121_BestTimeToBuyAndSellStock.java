package slidingwindow;

public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < min)min = price;
            if(price - min > maxProfit)maxProfit = price - min;
        }
        return maxProfit;
    }
}
