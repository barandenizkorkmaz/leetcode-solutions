package recursion;

// https://leetcode.com/problems/subsets-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90_Subsets_2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        recurse(nums, new ArrayList<>(), 0, result);
        return result;
    }

    private void recurse(int[] nums, List<Integer> current, int start, List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i = start ; i < nums.length ; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            current.add(nums[i]);
            recurse(nums, current, i + 1, result);
            current.remove(current.size() - 1);
        }
    }
}
