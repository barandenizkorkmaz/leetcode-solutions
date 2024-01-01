package array;

import java.util.Arrays;

// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/

public class _1877_MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int n = nums.length;
        for(int i = 0; i < n/2; i++){
            maxSum = Math.max(maxSum, nums[i] + nums[n - i - 1]);
        }
        return maxSum;

        /*
        100% Beats

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int hash[] = new int[100001];
        for(int num : nums) {
            hash[num]++;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int low = min;
        int high = max;
        max = Integer.MIN_VALUE;
        while(low <= high) {
            if(hash[low] == 0) low++;
            else if(hash[high] == 0) high--;
            else {
                max = Math.max(max, low + high);
                hash[low]--;
                hash[high]--;
            }
        }
        return max;
        */
    }
}
