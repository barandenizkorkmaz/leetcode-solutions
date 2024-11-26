package string;

// https://leetcode.com/problems/merge-strings-alternately/

public class _1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int current = 0;
        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();
        int minLength = Math.min(lengthOfWord1, lengthOfWord2);
        for(int i = 0 ; i < minLength; i++){
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        if(lengthOfWord1 > lengthOfWord2){
            stringBuilder.append(word1.substring(minLength));
        }
        else{
            stringBuilder.append(word2.substring(minLength));
        }
        return stringBuilder.toString();
    }
}
