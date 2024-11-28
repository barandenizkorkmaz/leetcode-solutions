package twopointers;

public class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int i = 0;
        int j = length - 1;

        while(i < j){
            while(i < length - 1 && !Character.isLetterOrDigit(s.charAt(i)))i++;
            while(j >= 0 && !Character.isLetterOrDigit(s.charAt(j)))j--;
            if(i >= j)break;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))return false;
            i++;
            j--;

        }
        return true;
    }
}
