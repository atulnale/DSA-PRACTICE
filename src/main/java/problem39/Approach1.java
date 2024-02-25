package problem39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Approach1 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> currRes = new ArrayList<>();
        helper(candidates, target, 0, currRes, 0);
        return result;
    }

    private void helper(int[] candidates, int target, int sum , List<Integer> currRes, int pos) {
        if(sum > target) return;
        if(sum == target){
            List<Integer> temp = new ArrayList<>(currRes);
            result.add(temp);
        }
        for(int i = pos; i< candidates.length; i++){
            currRes.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], currRes, i);
            currRes.remove(currRes.size()-1);
        }
    }
}