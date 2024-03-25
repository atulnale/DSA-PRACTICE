package problem117;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);

            if(nums[temp - 1] < 0){
                result.add(temp);
            } else {
                nums[temp-1] = - nums[temp-1];
            }
        }
        return result;
    }
}