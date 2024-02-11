package problem16;

import java.util.*;

public class Approach1 {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int minSum = 0;
        int size = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i< size - 1; i++) {
            int left = i +1;
            int right = size-1;
            while(left < right ) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < diff){
                    diff = Math.abs(target-sum);
                    minSum = sum;
                }
                if(sum < target) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return minSum;
    }

}


