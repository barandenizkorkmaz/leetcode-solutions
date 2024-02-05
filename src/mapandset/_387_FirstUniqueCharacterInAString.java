package mapandset;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class _387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        /*
        // First Attempt

        HashMap<Character, Integer> numOccurences = new HashMap<>();

        for(char c : s.toCharArray()){
            numOccurences.put(c, numOccurences.getOrDefault(c, 0) + 1);
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(numOccurences.get(s.charAt(i)) == 1){
                return i;
            }
        }
        */
        // Optimized Version: Use constant sized arrays since the number of letters in an alphabet is fixed.
        int[] numOccurences = new int[26];

        for(char c : s.toCharArray()){
            numOccurences[c - 'a']++;
        }

        for(int i=0 ; i < s.length() ; i++){
            if(numOccurences[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
