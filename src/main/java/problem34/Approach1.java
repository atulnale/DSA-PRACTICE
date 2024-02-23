package problem34;

public class Approach1 {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findPosition(nums, target, true);
        int lastPos;
        if(firstPos == -1){
            lastPos = -1;
        } else {
            lastPos = findPosition(nums, target, false);
        }
        return new int[]{firstPos, lastPos};
    }

    public int findPosition(int[] nums, int target, boolean isFirst){
        int left = 0; int right = nums.length-1;
        int pos = -1;
        while(left <=right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                pos = mid;
                if(isFirst){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(target < nums[mid]){
                right = mid -1 ;
            } else {
                left = mid + 1;
            }
        }
        return pos;

    }
}