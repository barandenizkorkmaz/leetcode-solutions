package general.math;

// https://leetcode.com/problems/length-of-last-word/
/*
    Takeaways:
    - Arrays -> Copy
 */

import java.util.Arrays;

public class _68_PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i>=0; i--){
            digits[i] += carry;
            carry = digits[i]/10;
            digits[i] = digits[i] % 10;
        }
        if (carry == 0){
            return digits;
        }
        else{
            int[] newArray = Arrays.copyOf(digits, digits.length + 1);
            newArray[0] = carry;
            System.arraycopy(digits, 0, newArray, 1, digits.length);
            return newArray;
        }
    }
}
