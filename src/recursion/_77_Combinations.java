package recursion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/combinations/

public class _77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if(k == 0)return Collections.emptyList();
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        combineRecurse(res, cur, n, k);
        return res;
    }

    private void combineRecurse(List<List<Integer>> res, List<Integer> cur, int n, int k){
        if(cur.size() == k){
            res.add(new LinkedList<>(cur));
            return;
        }
        int i = (cur.isEmpty()) ? 1 : cur.get(cur.size() - 1) + 1;
        for(; i <= n; i++){
            //if(cur.contains(i))continue;
            cur.add(i);
            combineRecurse(res, cur, n, k);
            cur.remove(cur.size() - 1);
        }

    }
}
