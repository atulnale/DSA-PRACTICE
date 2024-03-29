package problem123;

import java.util.Arrays;

public class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0;
        long ans = 0;
        int i = 0;
        int  j =  0;
        while(j < nums.length){
            if(nums[j] == max){
                count++;
            }
            while(count == k){
                if(nums[i] == max){
                    count--;
                }
                i++;
            }
            j++;
            ans += i ;
        }
        return ans;
    }
}