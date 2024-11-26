package array;

public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] numOccurences = new int[26];
        for(char c : s.toCharArray()){
            numOccurences[c - 'a'] += 1;
        }
        for(char c : t.toCharArray()){
            numOccurences[c - 'a'] -= 1;
        }
        for(int count : numOccurences){
            if(count != 0)return false;
        }
        return true;
    }
}
