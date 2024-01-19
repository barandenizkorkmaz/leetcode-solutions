package array;

// https://leetcode.com/problems/find-pivot-index/

public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        for(int num : nums){
            right += num;
        }
        right -= nums[0]; // Set right to correct initialization
        if(left == right)return 0;
        for(int i = 1; i < nums.length; i++){
            left += nums[i - 1];
            right -= nums[i];
            if(left == right)return i;
        }
        return -1;
    }
}
