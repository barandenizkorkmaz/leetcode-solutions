package numbers;

// https://leetcode.com/problems/reverse-integer/

public class _7_ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = (x < 0);
        x = Math.abs(x);
        int res = 0;
        while(x > 0){
            if(res > (Integer.MAX_VALUE - (x % 10)) / 10)return 0;
            res = 10 * res + (x % 10);
            x /= 10;
        }
        return res * (isNegative ? -1 : 1);
    }
}
