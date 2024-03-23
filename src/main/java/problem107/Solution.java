package problem107;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] prefix = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 1; i < prefix.length; i++) {
            int temp = prefix[i] - k;
            int res = map.getOrDefault(temp, 0);
            ans += res;
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }

        return  ans;
    }
}