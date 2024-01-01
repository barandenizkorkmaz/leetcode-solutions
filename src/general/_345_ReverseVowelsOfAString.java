package general;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        char[] characters = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < characters.length - 1 && !isVowel(characters[left])){
                left++;
            }
            while(right > 0 && !isVowel(characters[right])){
                right--;
            }
            if(left < right){
                char tmp = characters[left];
                characters[left] = characters[right];
                characters[right] = tmp;
                left++;
                right--;
            }
        }

        return new String(characters);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
