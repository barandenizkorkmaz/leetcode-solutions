package slidingwindow;

// https://leetcode.com/problems/maximum-average-subarray-i/

public class _643_MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        for(i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        i = 1;
        while(i + k - 1 <= nums.length - 1){
            sum += nums[i+k-1] - nums[i-1];
            if(sum > maxSum)maxSum=sum;
            i++;
        }
        return (double)maxSum/k;
    }
}
