package search.binary;

// https://leetcode.com/problems/search-a-2d-matrix/

public class _74_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m - 1;
        int mid = low + (high - low)/2;
        while(low <= high){
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid = low + (high - low)/2;
        }

        int row = mid; //mid can be bottom row (targetRow + 1)
        if(row >= m || matrix[row][0] > target){
            row--;
            if(row < 0)return false;

        }

        low = 0;
        high = n - 1;
        mid = low + (high - low)/2;
        while(low <= high){
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid = low + (high - low)/2;
        }

        return false;
    }
}
