package problem122;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
            int i = 0;
            int j = 0;
            int ans = 0;
            while(j < nums.length){
                int num = nums[j];
                int freq = map.getOrDefault(num, 0);
                if(freq < k){
                  j++;
                  ans = Math.max(ans,j - i );
                  map.put(num, freq + 1);
                } else {
                    do{
                        map.put(nums[i], map.get(nums[i])-1);
                        i++;
                    }while(nums[i-1] != num);
                }
            }
            return ans;
    }
}