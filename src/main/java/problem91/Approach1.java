package problem91;

public class Approach1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int curr = 0;
        for(int ele: nums) {
            if(ele == 1){
                curr++;
                ans = Math.max(curr, ans);
            } else {
                curr = 0;
            }
        }
        return ans;
    }
}