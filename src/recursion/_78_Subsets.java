package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/subsets/

public class _78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        subsetsRecurse(res, new LinkedList<>(), nums, 0);
        return res;
    }

    private void subsetsRecurse(List<List<Integer>> res, List<Integer> current, int[] nums, int index){
        res.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            subsetsRecurse(res, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
