package problem99;

public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int ele: prices){
            if(ele < min){
                min = ele;
            } else {
                ans = Math.max(ele - min, ans);
            }
        }
        return ans;
    }
}