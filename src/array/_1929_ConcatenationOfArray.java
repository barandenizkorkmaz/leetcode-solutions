package array;

// https://leetcode.com/problems/concatenation-of-array/description/

public class _1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }
        return res;
    }
}
