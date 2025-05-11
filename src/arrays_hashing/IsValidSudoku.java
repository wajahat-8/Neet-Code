package arrays_hashing;

import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!seen.add(num + " in row " + i) ||
                            !seen.add(num + " in col " + j) ||
                            !seen.add(num + " in box " + (i / 3) + "-" + (j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsValidSudoku solution = new IsValidSudoku();

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '9', '.', '.', '8', '.', '5', '.'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = solution.isValidSudoku(board);
        System.out.println("Is the board valid? " + result);
    }
}
