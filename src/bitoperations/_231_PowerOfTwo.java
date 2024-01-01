package bitoperations;

// https://leetcode.com/problems/power-of-two/

public class _231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n&n-1) == 0);
    }
}
