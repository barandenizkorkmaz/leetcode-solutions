package general;

// https://leetcode.com/problems/happy-number/

public class _202_HappyNumber {
    public boolean isHappy(int n) {
        int current;
        int j = 0;

        while(j++ < 10){
            current = 0;

            while(n > 0){
                int lastDigit = n % 10;
                current += lastDigit * lastDigit;
                n = n / 10;
            }

            if(current == 1) return true;
            n = current;
        }
        return false;
    }
}
