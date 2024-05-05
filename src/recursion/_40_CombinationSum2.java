package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _40_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new LinkedList<>();
        recurse(candidates, current, result, target, 0);
        return result;
    }

    private void recurse(int[] nums, List<Integer> current, List<List<Integer>> result, int remaining, int start){
        if(remaining < 0)return;
        else if(remaining == 0)result.add(new ArrayList<>(current));
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i - 1 ])continue;
                current.add(nums[i]);
                recurse(nums, current, result, remaining - nums[i], i + 1);
                current.remove(current.size() - 1);
            }
        }
    }
}
