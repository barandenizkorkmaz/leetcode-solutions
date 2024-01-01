package string;

// https://leetcode.com/problems/removing-stars-from-a-string/

public class _2390_RemovingStarsFromAString {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        char c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == '*'){
                res.deleteCharAt(res.length() - 1);
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
