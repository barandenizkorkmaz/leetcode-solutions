package general;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/

public class _118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> prev = null;
        res.add(new LinkedList<Integer>(Arrays.asList(1)));
        int currentRow = 2;
        while(currentRow <= numRows){
            prev = res.get(res.size() - 1);
            List<Integer> current = new LinkedList<Integer>(Arrays.asList(1));
            for(int index = 1; index <= currentRow - 2; index++){
                current.add(prev.get(index - 1) + prev.get(index));
            }
            current.add(1);
            res.add(current);
            currentRow++;
        }
        return res;
    }
}
