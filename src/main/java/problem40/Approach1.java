package problem40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Approach1 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> currRes = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, currRes, -1);
        return result;
    }

    private void helper(int[] candidates, int target, int sum, List<Integer> currRes, int pos) {
        if(target < sum) return ;
        if(target == sum) {
            List<Integer> temp = new ArrayList<>(currRes);
            result.add(temp);
        }
        for(int i = pos +1 ; i< candidates.length; i++){
            if(i != pos + 1 && candidates[i]==candidates[i-1]) continue;;
            currRes.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], currRes, i);
            currRes.remove(currRes.size()-1);
        }
    }
}