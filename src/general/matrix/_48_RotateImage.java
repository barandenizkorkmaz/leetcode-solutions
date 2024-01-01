package general.matrix;

// https://leetcode.com/problems/rotate-image/

public class _48_RotateImage {
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public void reverseColumns(int[][] matrix){
        int n = matrix.length;
        for(int col = 0; col < n/2; col++){
            for(int row = 0; row < n; row++){
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[row][n - col - 1];
                matrix[row][n - col - 1] = tmp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseColumns(matrix);
    }
}
