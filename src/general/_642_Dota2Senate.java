package general;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/dota2-senate/

public class _642_Dota2Senate {
    public String predictPartyVictory(String senate) {
        int dcount = 0, rcount = 0, dban = 0, rban = 0;
        int n = senate.length();
        Queue<Character> q = new LinkedList<>();
        for (char c : senate.toCharArray()) {
            if (c == 'D') dcount++;
            else rcount++;
            q.offer(c);
        }
        while (dcount > 0 && rcount > 0) {
            char curr = q.poll();
            if (curr == 'D') {
                if (dban > 0) {
                    dban--;
                    dcount--;
                } else {
                    rban++;
                    q.offer(curr);
                }
            } else {
                if (rban > 0) {
                    rban--;
                    rcount--;
                } else {
                    dban++;
                    q.offer(curr);
                }
            }
        }
        return rcount > 0 ? "Radiant" : "Dire";
    }
}
