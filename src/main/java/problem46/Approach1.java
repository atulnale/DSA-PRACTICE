package problem46;

import java.util.*;

public class Approach1 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new HashSet<>(), new ArrayList<Integer>());
        return result;
    }


    private void helper(int[] nums, Set<Integer> seen, List<Integer> currList) {
        if(nums.length == seen.size()){
            result.add(new ArrayList<>(currList));
            return;
        }
        for(int ele: nums){
            if(seen.contains(ele)) continue;
           seen.add(ele);
           currList.add(ele);
           helper(nums, seen, currList);
           currList.remove(currList.size()-1);
           seen.remove(ele);
        }
    }
}