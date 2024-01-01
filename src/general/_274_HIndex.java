package general;

import java.util.Arrays;

// https://leetcode.com/problems/h-index/

public class _274_HIndex {
    public int hIndex(int[] citations) {
        int currentH = 0;
        Arrays.sort(citations);
        int size = citations.length;
        for(int i = 0; i < size; i++){
            currentH = Math.max(currentH, Math.min(citations[i], size - i));
        }
        return currentH;
    }
}
