package problem54;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;
        boolean cont = true;
        while(cont){
            cont = false;
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                cont = true;
            }
            if(cont){
                cont = false;
            }else{
                break;
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                result.add(matrix[i][right]);
                cont = true;
            }
            if(cont){
                cont = false;
            }else{
                break;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                result.add(matrix[bottom][i]);
                cont = true;

            }
            if(cont){
                cont = false;
            }else{
                break;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                result.add(matrix[i][left]);
                cont = true;

            }
            left++;
        }
        return result;
    }

}