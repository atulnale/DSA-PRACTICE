package problem4;

import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length < nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int t = ((nums1.length + nums2.length +1) / 2) ;
        int l1 = 0,l2 = 0,r1 = 0,r2 =0 ;
        int left = 0;
        int right = nums1.length;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(mid == 0 ){
                l1 = Integer.MIN_VALUE;
            } else {
                l1 = nums1[mid-1];
            }
            if(mid == nums1.length){
                r1 = Integer.MAX_VALUE;
            } else {
                r1 = nums1[mid];
            }

            int k = t - mid;
            if(k == 0 ){
                l2 = Integer.MIN_VALUE;
            } else {
                l2 = nums2[k - 1];
            }
            if(k >= nums2.length) {
                r2 = Integer.MAX_VALUE;
            } else {
                r2 = nums2[k];
            }

            if(Math.max(l1,l2) <= Math.min(r1,r2)){
                if((nums1.length + nums2.length) % 2 == 0){
                    return (Math.max(l1,l2) + Math.min(r1,r2) )/ 2.0;
                }
                return Math.max(l1,l2);
            }
            if(l1 > r2){
                right = mid -1;
            } else if( l2 > r1) {
                left = mid + 1;
            }

        }

return 0.0;
    }
}
