package array;

// https://leetcode.com/problems/shuffle-the-array/

public class _1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int ind1 = 0, ind2 = n;
        for(int i = 0 ; i < 2 * n ; i = i + 2){
            res[i] = nums[ind1++];
            res[i+1] = nums[ind2++];
        }
        return res;
    }
}
