package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
        while(start < end){
            while(start < end && !vowels.contains(charArray[start])){
                start++;
            }
            while(end > start && !vowels.contains(charArray[end])){
                end--;
            }
            // swap
            char tmp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tmp;
            start++;
            end--;
        }
        String res = new String(charArray);
        return res;
    }
}
