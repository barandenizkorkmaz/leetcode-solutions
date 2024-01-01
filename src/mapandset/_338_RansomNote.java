package mapandset;

// https://leetcode.com/problems/ransom-note/

import java.util.HashMap;
import java.util.Map;

public class _338_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char _char = ransomNote.charAt(i);
            int count = ransomNoteMap.containsKey(_char) ? ransomNoteMap.get(_char) : 0;
            ransomNoteMap.put(_char, count + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char _char = magazine.charAt(i);
            int count = magazineMap.containsKey(_char) ? magazineMap.get(_char) : 0;
            magazineMap.put(_char, count + 1);
        }

        for (Character _char : ransomNoteMap.keySet()){
            int count = magazineMap.containsKey(_char) ? magazineMap.get(_char) : 0;
            if(count < ransomNoteMap.get(_char))return false;
        }
        return true;
    }
}
