package mapandset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/unique-number-of-occurrences/

public class _1207_UniqueNumberOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(map.get(num) != null){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int occurence : map.values()){
            if(set.contains(occurence))return false;
            set.add(occurence);
        }
        return true;

    }
}
