package mapandset;

import java.util.*;

public class _49_GroupAnagrams {
    private String sort(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs){
            String sorted = sort(str);
            anagrams.putIfAbsent(sorted, new LinkedList<>());
            anagrams.get(sorted).add(str);
        }
        return new LinkedList<>(anagrams.values());
    }
}
