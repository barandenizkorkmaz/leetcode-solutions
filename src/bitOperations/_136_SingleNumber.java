package bitOperations;

// https://leetcode.com/problems/single-number/

public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int num : nums){
            answer ^= num;
        }
        return answer;
    }
}
