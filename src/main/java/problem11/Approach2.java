package problem11;


public class Approach2 {
    public int maxArea(int[] height) {
        int water = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            int min = Math.min(height[l], height[r]);
            water = Math.max(water, (r - l) * min);
            while(l<r && height[l]<= min ) l++;
            while(l<r && height[r]<= min ) r--;
        }
        return water;
    }
}
