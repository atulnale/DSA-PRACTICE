package problem47;

import java.util.*;

public class Approach1 {
    List<List<Integer>> result = new ArrayList<>();
    Set<String> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> oc = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            oc.put(nums[i], oc.getOrDefault(nums[i],0)+1);
        }
        helper(nums,new HashMap<>(), oc,new ArrayList<Integer>());
        return result;
    }


    private void helper(int[] nums, HashMap<Integer, Integer> seen,Map<Integer, Integer> oc, List<Integer> currList) {
        if(currList.size() == nums.length){
            result.add(new ArrayList<>(currList));
            return;
        }
        Set<Integer> tempSeen = new HashSet<>();
        for(int ele: nums){
            if(tempSeen.contains(ele)) continue;
            if(seen.getOrDefault(ele,0) >= oc.get(ele)) continue;
            tempSeen.add(ele);
            currList.add(ele);
            seen.put(ele, seen.getOrDefault(ele,0)+1);
            helper(nums,seen,oc, currList);
            seen.put(ele, seen.get(ele)-1);
            currList.remove(currList.size()-1);
        }
    }
}