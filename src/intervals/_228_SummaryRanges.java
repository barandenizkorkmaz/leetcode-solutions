package intervals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges

public class _228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0)return Collections.emptyList();

        List<String> res = new LinkedList<>();
        int start = nums[0], prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev + 1){ // sequence goes on
                prev = nums[i];
            }
            else{ // sequence interrupted
                res.add(getRangeString(start, prev));
                start = nums[i];
                prev = nums[i];
            }
        }
        res.add(getRangeString(start, prev));
        return res;
    }

    private String getRangeString(int start, int end){
        return (start == end) ? "" + start : start + "->" + end;
    }
}
