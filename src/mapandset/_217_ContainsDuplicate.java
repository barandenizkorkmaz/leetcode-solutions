package mapandset;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> observed = new HashSet<>();
        for(int num : nums){
            if(!observed.add(num))return true;
        }
        return false;
    }
}
