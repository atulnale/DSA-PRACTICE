package problem42;

public class Approach1 {
    public int trap(int[] height) {
        int ans = 0;
        for (int i = 1; i < height.length-1; i++) {
            int left_max = 0;
            int right_max = 0;
            for (int j = i; j >=0 ; j--) {
                left_max = Math.max(left_max, height[j]);
            }
            for (int j = i; j <height.length ; j++) {
                right_max = Math.max(right_max, height[j]);
            }
            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }
}