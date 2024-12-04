package trie;

import java.util.*;

public class _139_WordBreak_V2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> prefixMap = new HashMap<>();
        Set<String> wordSet = new HashSet<>(wordDict);
        return canBeFormed(s, wordSet, prefixMap);
    }

    private boolean canBeFormed(String s, Set<String> wordSet, Map<String, Boolean> prefixMap){
        if(prefixMap.containsKey(s))return prefixMap.get(s);
        if(wordSet.contains(s))return true;

        for(int i = 1 ; i <= s.length(); i++){
            String prefix = s.substring(0, i);
            if(wordSet.contains(prefix)){
                prefixMap.put(prefix, true);
                if(canBeFormed(s.substring(i), wordSet, prefixMap)){
                    prefixMap.put(s, true);
                    return true;
                }
            }
        }
        prefixMap.put(s, false);
        return false;

    }
}
