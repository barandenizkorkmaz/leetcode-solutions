package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47_Permutations_2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] usedIndices = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        recurse(nums, result, new ArrayList<>(), usedIndices);
        return result;
    }

    private void recurse(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] used){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] == true || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])continue;
                used[i] = true;
                current.add(nums[i]);
                recurse(nums, result, current, used);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
