package algorithmic;

// https://leetcode.com/problems/number-of-good-pairs/description/

public class _1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0, cnt[] = new int[101];
        for (int num: nums) {
            ans += cnt[num]++;
        }
        return ans;
    }
}
