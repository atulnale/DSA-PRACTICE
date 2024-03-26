package problem118;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
       int prefix[] = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            prefix[i+1] = arr[i] + prefix[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < prefix.length; i++) {
            if(map.containsKey(prefix[i])){
                Integer pos = map.get(prefix[i]);
                ans = Math.max(ans, i - pos);
            } else {
                map.put(prefix[i], i );
            }
        }
        return ans;
    }
}