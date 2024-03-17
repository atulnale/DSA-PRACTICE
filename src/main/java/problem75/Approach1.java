package problem75;

import java.util.Arrays;

public class Approach1 {
    public int maxFrequency(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);;
        int l = 0;
        long currSum = 0;
        for (int r = 0; r < nums.length; r++) {
            currSum += nums[r];
            long reqSum = ((long)(r - l + 1)) * nums[r];
            long diff = reqSum - currSum;
            if(diff > k){
                currSum -= nums[l];
                l++;
                continue;
            }
           result = Math.max(result, r - l + 1);
        }
        return result;
    }
}