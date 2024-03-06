package problem51;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Approach1 {
    Set<Integer> row = new HashSet<>();
    Set<Integer> diag = new HashSet<>();
    Set<Integer> anti = new HashSet<>();
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] mat = new int[n][n];
        helper(mat, 0,0,0, n);
        return result;
    }

    private void helper(int[][] mat, int placed,int r, int c, int n) {
        if(placed == n) {
            addResult(mat);
        }
        for (int k = 0; k < n; k++) {
            if(isValid(mat,k, c, n )){
                row.add(k);
                diag.add(k-c);
                anti.add(k+c);
                mat[k][c]=1;
                helper(mat,placed+1, r,c+1,n);
                row.remove(k);
                anti.remove(k+c);
                diag.remove(k-c);
                mat[k][c]= 0;
            }
        }
    }

    private void addResult(int[][] mat) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < mat.length ; j++) {
                if(mat[i][j] == 0){
                    stringBuilder.append(".");
                } else {
                    stringBuilder.append("Q");
                }
            }
            list.add(stringBuilder.toString());
        }
        result.add(list);
    }

    private boolean isValid(int[][] mat, int r, int c, int n){
        if(row.contains(r) || diag.contains(r-c) || anti.contains(r+c)) return false;
        return true;
    }

}