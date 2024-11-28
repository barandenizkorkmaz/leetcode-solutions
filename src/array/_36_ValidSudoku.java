package array;

public class _36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i) || !isValidColumn(board, i))return false;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!isValidSquare(board, 3*i, 3*j))return false;
            }
        }
        return true;
    }

    public boolean isValidRow(char[][] board, int rowNum){
        boolean[] isObserved = new boolean[10];
        for(int i = 0; i < 9; i++){
            if (Character.isDigit(board[rowNum][i])) { // Determines if the specified character is a digit.
                int value = Character.getNumericValue(board[rowNum][i]); //Returns the int value that the
                if(isObserved[value])return false;
                isObserved[value] = true;
            }
        }
        return true;
    }

    public boolean isValidColumn(char[][] board, int colNum){
        boolean[] isObserved = new boolean[10];
        for(int i = 0; i < 9; i++){
            if(Character.isDigit(board[i][colNum])){
                int value = Character.getNumericValue(board[i][colNum]);
                if(isObserved[value])return false;
                isObserved[value] = true;
            }
        }
        return true;
    }

    public boolean isValidSquare(char[][] board, int x, int y){
        boolean[] isObserved = new boolean[10];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(Character.isDigit(board[x + i][y + j])){
                    int value = Character.getNumericValue(board[x + i][y + j]);
                    if(isObserved[value])return false;
                    isObserved[value] = true;
                }
            }
        }
        return true;
    }
}
