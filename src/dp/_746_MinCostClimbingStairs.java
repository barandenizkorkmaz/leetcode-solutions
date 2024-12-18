package dp;

public class _746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] costs = new int[n];
        costs[0] = cost[0];
        costs[1] = cost[1];
        for(int i = 2; i < n; i++){
            costs[i] = Math.min(costs[i-2], costs[i - 1]) + cost[i];
        }
        return Math.min(costs[n-1], costs[n-2]);
    }

    /*

    For me, below solution is more intuitive to understand!

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2)return Math.min(cost[0], cost[1]);
        int[] dp = new int[cost.length + 1];
        for(int i = 2; i < cost.length + 1; i++){
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[cost.length];
    }
     */
}
