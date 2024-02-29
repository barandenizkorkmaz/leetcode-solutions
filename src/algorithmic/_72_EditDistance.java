package algorithmic;

// https://leetcode.com/problems/edit-distance/description/

public class _72_EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        // base case
        if(m == 0 || n == 0){
            return (m == 0) ? n : m;
        }

        int[][] editDistance = new int[m + 1][n + 1];

        // initialize
        for(int row = 0; row < m + 1; row++)editDistance[row][0] = row;
        for(int col = 0; col < n + 1; col++)editDistance[0][col] = col;

        for(int i = 1 ; i < m + 1; i ++){
            for(int j = 1; j < n + 1; j++){
                int removeCost = editDistance[i - 1][j] + 1;
                int insertCost = editDistance[i][j - 1] + 1;
                int marginalSubstituteCost = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1;
                int substituteCost = editDistance[i - 1][j - 1] + marginalSubstituteCost;
                editDistance[i][j] = Math.min(Math.min(removeCost, insertCost), substituteCost);
            }
        }

        return editDistance[m][n];
    }
}
