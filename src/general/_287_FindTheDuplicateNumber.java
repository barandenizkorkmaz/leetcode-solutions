package general;

// https://leetcode.com/problems/find-the-duplicate-number/description/

public class _287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        boolean[] records = new boolean[nums.length - 1];
        for(int num : nums){
            if(records[num - 1])return num;
            records[num - 1] = true;
        }
        return -1;
    }
}
