package problem92;

public class Approach1 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int ele: nums){
            ans ^= ele;
        }
        return ans;
    }
}