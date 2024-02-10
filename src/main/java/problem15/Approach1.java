package problem15;

import java.util.*;

public class Approach1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int curr = 10;
        for(int i = 0; i< nums.length-2; i++){
            Set<Integer> set = new HashSet<>();
            Set<Integer> seen = new HashSet<>();
            if(nums[i]> 0) return result;
            int key = nums[i];
            if(curr == key){
                continue;
            }
            for(int j = i+1; j<nums.length; j++) {
               int temp = (key * -1) - nums[j];
               if(set.contains(temp) && !seen.contains(temp)){
                   List<Integer> list = new ArrayList<>();
                   list.add(key);list.add(temp);list.add(nums[j]);
                   result.add(list);
                   seen.add(temp);
                   seen.add(nums[j]);
               }
               set.add(nums[j]);
            }
            curr = key;
        }
        return result;
    }

}


