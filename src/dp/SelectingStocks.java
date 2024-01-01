package dp;

import java.util.List;

// Snowflake - SWE Internship - 2023

public class SelectingStocks {

    public static int maximizeProfit(int saving, List<Integer> currentValue, List<Integer> futureValue) {
        int[][] dp = new int[currentValue.size() + 1][saving + 1];

        for (int i = 1; i <= currentValue.size(); i++) {
            int cost = currentValue.get(i - 1);
            int profit = futureValue.get(i - 1) - cost;

            for (int j = 0; j <= saving; j++) {
                // Option 1: Skip the stock
                dp[i][j] = dp[i - 1][j];

                // Option 2: Buy the stock (if affordable and profitable)
                if (j >= cost && profit > 0) {
                    dp[i][j] = Math.max(dp[i][j], profit + dp[i - 1][j - cost]);
                }
            }
        }

        return dp[currentValue.size()][saving]; // right bottom cell of matrix represents the answer
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> currentValues = List.of(175, 133, 109, 210, 97);
        List<Integer> futureValues = List.of(200, 125, 128, 228, 133);
        int savings = 250;
        System.out.println("Maximum Profit: " + maximizeProfit(savings, currentValues, futureValues));
        assert maximizeProfit(savings, currentValues, futureValues) == 55;
    }
}
