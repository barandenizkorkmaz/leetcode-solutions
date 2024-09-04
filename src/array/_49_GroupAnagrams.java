package array;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String sortedStr = sort(s);  // Store the sorted string result in a variable
            map.putIfAbsent(sortedStr, new LinkedList<String>());
            map.get(sortedStr).add(s);
        }
        return new LinkedList<>(map.values());
    }

    private String sort(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
