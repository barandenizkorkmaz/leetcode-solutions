package string;

// https://leetcode.com/problems/length-of-last-word/

public class _58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int start = -1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(start == -1 && s.charAt(i) != ' '){
                start = i;
            }
            if(start != -1 && s.charAt(i) == ' '){
                return start - (i + 1) + 1;
            }
        }
        return start + 1;
    }
}
