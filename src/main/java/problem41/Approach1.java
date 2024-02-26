package problem41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Approach1 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] <= nums.length){
                int j = i;
                while(nums[j] != j+ 1 &&  nums[j] > 0 && nums[j] <= nums.length){
                    int temp = nums[j];
                    if(temp == nums[temp -1]) break;
                    nums[j] = nums[temp-1];
                    nums[temp - 1] = temp;

                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+ 1;
    }
}