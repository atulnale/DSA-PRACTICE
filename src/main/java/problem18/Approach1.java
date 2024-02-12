package problem18;

import java.util.*;

public class Approach1 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int k = 3;
        int left =0;
        int right = nums.length;
        helper(k,0, nums, target, left, right, new ArrayList<>());
        return  result;
    }

    private void helper(int k, int start, int[] nums, long target, int left, int right, List<Integer> currList) {
        if(k-1 == 0){
            Set<Long> set = new HashSet<>();
            Set<String> seen = new HashSet<>();
            for(int i = left; i<right; i++){
                if(seen.contains((target - nums[i])+":"+nums[i]) || seen.contains(nums[i]+":"+(target - nums[i]))) continue;
                if(set.contains(target - (long)nums[i])){
                    List<Integer> tempList = new ArrayList<>(currList);
                    tempList.add(nums[i]);
                    tempList.add((int)target - nums[i]);
                    result.add(tempList);
                    seen.add((target - nums[i])+":"+nums[i]);
                }
                set.add((long)nums[i]);
            }
        }else {
            int i = left;
            while(i< nums.length-k) {
              //  if(nums[i] > target && nums[i] >0 ) break;
                currList.add(nums[i]);
                helper(k-1,start+1,nums,target-nums[i], i+1, right,currList);
                currList.remove(currList.size()-1);
                while(i < nums.length-k && nums[i]==nums[i+1]){
                    i++;
                }
                i++;
            }
        }
    }
}


