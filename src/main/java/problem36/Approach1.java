package problem36;

import java.util.HashSet;
import java.util.Set;

public class Approach1 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rows = new HashSet<>();
        Set<String> cols = new HashSet<>();
        Set<String> block = new HashSet<>();
        for(int i = 0 ; i< 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(rows.contains(String.valueOf(i) + board[i][j])
                     || cols.contains(String.valueOf(j) + board[i][j])
                    || block.contains(String.valueOf(i/3) + String.valueOf(j/3) + board[i][j] )){
                        return false;
                    }
                    rows.add(String.valueOf(i) + board[i][j]);
                    cols.add(String.valueOf(j) + board[i][j]);
                    block.add(String.valueOf(i/3) + String.valueOf(j/3) + board[i][j] );
                }

            }
        }
        return true;
    }
}