package recursion;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/permutations/

public class _46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        recursePermute(res, new LinkedList<>(), nums);
        return res;
    }

    private void recursePermute(List<List<Integer>> res, List<Integer> current, int[] nums){
        if(current.size() == nums.length){
            res.add(new LinkedList<>(current));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(current.contains(nums[i])) continue; // element already exists, skip
                current.add(nums[i]);
                recursePermute(res, current, nums);
                current.remove(current.size() - 1);
            }
        }

    }
}
