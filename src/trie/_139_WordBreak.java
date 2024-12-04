package trie;

import java.util.List;

public class _139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int maxLength = 0;
        for(String word : wordDict){
            maxLength = Math.max(maxLength, word.length());
        }
        // Set<String> wordSet = new HashSet<>(wordDict);
        for(int i = 0; i < n; i++){
            for(int j = i; j >= Math.max(i - maxLength, 0); j--){
                // Check if current index can be combined with a previous prefix
                if(dp[j] && wordDict.contains(s.substring(j, i + 1))){ // note that index i actually corresponds to index i - 1 on word itself!
                    dp[i + 1] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
