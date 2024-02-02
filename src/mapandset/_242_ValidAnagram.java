package mapandset;

import java.util.HashMap;
import java.util.Map;

public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character, Integer> numOccurences = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            if(numOccurences.containsKey(c)){
                numOccurences.put(c, numOccurences.get(c) + 1);
            }
            else{
                numOccurences.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(numOccurences.containsKey(c)){
                numOccurences.put(c, numOccurences.get(c) - 1);
            }
            else{
                return false;
            }
        }
        for(int numOccurence : numOccurences.values()){
            if(numOccurence != 0)return false;
        }
        return true;
    }
}
