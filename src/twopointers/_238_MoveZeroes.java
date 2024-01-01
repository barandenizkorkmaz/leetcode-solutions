package twopointers;

// https://leetcode.com/problems/move-zeroes/

public class _238_MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int slow = 0;
        int fast = 1;
        while(fast < nums.length ){
            if(nums[slow] == 0){
                while(fast < nums.length - 1 && nums[fast] == 0){
                    fast++;
                }
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
            slow++;
            fast++;
        }
    }
}
