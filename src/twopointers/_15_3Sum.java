package twopointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/3sum/description/
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < nums.length - 1 && j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total < 0){
                    j++;
                }
                else if(total > 0){
                    k--;
                }
                else{ // total == 0
                    result.add(new LinkedList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;
                    while(j < nums.length - 1 && nums[j] == nums[j - 1]){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
