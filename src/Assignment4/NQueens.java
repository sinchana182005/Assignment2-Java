package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, 0, result);
        return result;
    }

    public static void solve(char[][] board, int col, List<List<String>> result) {

        if (col == board.length) {
            result.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, col + 1, result);

                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static List<String> construct(char[][] board) {

        List<String> list = new ArrayList<>();

        for (char[] row : board) {
            list.add(new String(row));
        }

        return list;
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> result = solveNQueens(n);

        System.out.println(result);
    }
}

