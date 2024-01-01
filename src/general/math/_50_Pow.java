package general.math;

// https://leetcode.com/problems/powx-n/

public class _50_Pow {
    public double myPow(double x, int n) {
        if (n == 0 )return 1.0;
        if (n < 0){
            x = 1/x;
            n = -n;
        }
        return helper(x, n);
    }

    static double helper(double base, int exponent){
        if(exponent == 0)return 1.0;
        double subResult = helper(base, exponent / 2);
        return (exponent % 2 == 0) ? (subResult * subResult) : (subResult * subResult * base);
    }
}
