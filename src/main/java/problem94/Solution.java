package problem94;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int i = 0;
        int sum = 0;
        int ans = 0;
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
            while( sum > k){
                sum -=a[i];
                i++;
            }
            if(sum == k){
                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}