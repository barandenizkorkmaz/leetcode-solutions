package general.typeconversion;

// https://leetcode.com/problems/palindrome-number/

public class _9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if(s.startsWith("-")){
            return false;
        }
        int len = s.length();
        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
