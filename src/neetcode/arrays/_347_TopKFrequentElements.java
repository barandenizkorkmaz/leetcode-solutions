package neetcode.arrays;

import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements/

public class _347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> numOccurences = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        int current = nums[0];
        int count = 0;
        for(int num : nums){
            if(num != current){
                numOccurences.put(current, count);
                current = num;
                count = 1;
            }
            else
                count++;
        }
        numOccurences.put(current, count);
        for(int key : numOccurences.keySet()){
            int numOccurence = numOccurences.get(key);
            if(bucket[numOccurence] == null){
                bucket[numOccurence] = new LinkedList<>();
            }
            bucket[numOccurence].add(key);
        }
        int[] answer = new int[k];
        int position = 0;
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int j = 0; j < bucket[i].size() && position < k; j++){
                    answer[position] = bucket[i].get(j);
                    position++;
                }
            }
        }
        return answer;
    }
}
