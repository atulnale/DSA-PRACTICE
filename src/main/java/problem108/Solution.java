package problem108;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        if(numRows == 1){
            return result;
        }
        result.add(List.of(1,1));
        if(numRows == 2){
            return  result;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            List<Integer> prev = result.get(result.size()-1);
            int k = 0;
            while(k < prev.size()-1){
                curr.add(prev.get(k) + prev.get(k+1));
                k++;
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}