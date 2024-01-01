package recursion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class _17_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return Collections.emptyList();
        }
        List<String> combinations = new LinkedList<>();
        String[] phoneLetters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinationsRecurse(combinations, "", digits, phoneLetters);
        return combinations;
    }

    public void letterCombinationsRecurse(List<String> combinations, String currentCombination, String remainingDigits, String[] phoneLetters){
        if(remainingDigits.isEmpty()){
            combinations.add(currentCombination);
        }
        else{
            String currentLetters = phoneLetters[remainingDigits.charAt(0) - '2'];
            for(char c : currentLetters.toCharArray()){
                letterCombinationsRecurse(combinations, currentCombination + c, remainingDigits.substring(1), phoneLetters);
            }
        }
    }
}
