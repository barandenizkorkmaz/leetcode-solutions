package mapandset;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
