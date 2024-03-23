package problem109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int occ = nums.length/3;
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < nums.length; i++) {
            int j = i + 1;
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            j--;
            if(j - i + 1 > occ){
                result.add(nums[i]);
            }
            i = j;
        }
        return result;
    }
}