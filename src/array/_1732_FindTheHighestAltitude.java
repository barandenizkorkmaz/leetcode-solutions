package array;

// https://leetcode.com/problems/find-the-highest-altitude/

public class _1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int cur = 0, max = 0;
        for(int elem : gain){
            cur += elem;
            if(cur > max)max = cur;
        }
        return max;
    }
}
