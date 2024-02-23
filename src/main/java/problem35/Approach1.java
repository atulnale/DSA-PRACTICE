package problem35;

public class Approach1 {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) return nums.length;
        int left = 0;
        int right= nums.length -1 ;
        int pos = 0;
        while(left <= right ) {
            int mid = left + (right - left ) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target){
                pos = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return pos;
    }
}