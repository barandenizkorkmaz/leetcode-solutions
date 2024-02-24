package array;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/set-matrix-zeroes/description/

public class _73_SetMatrixZeroes {
    class Coordinates{
        int x;
        int y;

        public Coordinates(int _x, int _y){
            this.x = _x;
            this.y = _y;
        }
    }

    public void setZeroes(int[][] matrix) {
        Queue<Coordinates> queue= new LinkedList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    queue.add(new Coordinates(i,j));
                }
            }
        }
        for(Coordinates coordinate : queue){
            setRow2Zeros(matrix, coordinate.x);
            setColumn2Zeros(matrix, coordinate.y);
        }
    }

    public void setRow2Zeros(int[][] matrix, int row){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }

    public void setColumn2Zeros(int[][] matrix, int col){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }
}
