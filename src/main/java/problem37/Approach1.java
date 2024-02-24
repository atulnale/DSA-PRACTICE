package problem37;

import java.util.*;

public class Approach1 {
    public void solveSudoku(char[][] board) {
        Set<String> rows = new HashSet<>();
        Set<String> cols = new HashSet<>();
        Set<String> block = new HashSet<>();
        List<String> empty = new ArrayList<>();
        for(int i = 0 ; i< 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    rows.add(String.valueOf(i) + board[i][j]);
                    cols.add(String.valueOf(j) + board[i][j]);
                    block.add(String.valueOf(i/3) + String.valueOf(j/3) + board[i][j] );
                }else {
                    empty.add("%s%s".formatted(String.valueOf(i), String.valueOf(j)));
                }

            }
        }
        helper(board, rows, cols, block, empty, 0);

    }

    private boolean helper(char[][] board, Set<String> rows, Set<String> cols, Set<String> block, List<String> empty, int pos) {
        if(pos == empty.size()){
            return true;
        }
        boolean result;
        for (int k = 1; k <=9; k++) {
            int i = Integer.valueOf(empty.get(pos).substring(0,1));
            int j = Integer.valueOf(empty.get(pos).substring(1));
            if( rows.contains(String.valueOf(i) + k)
                    || cols.contains(String.valueOf(j) + k)
                    || block.contains(String.valueOf(i/3) + String.valueOf(j/3) + k )) {
                continue;
            } else {
                rows.add(String.valueOf(i) + k);
                cols.add(String.valueOf(j) + k);
                block.add(String.valueOf(i/3) + String.valueOf(j/3) + k );
                board[i][j] = Character.forDigit(k,10);
                result = helper(board, rows, cols, block, empty, pos + 1);
                if(result == false){
                    rows.remove(String.valueOf(i) + k);
                    cols.remove(String.valueOf(j) + k);
                    block.remove(String.valueOf(i/3) + String.valueOf(j/3) + k );

                    board[i][j] = '.';
                    continue;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}