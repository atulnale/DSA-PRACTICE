package problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void input1() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = approach1.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.00000, result);
    }
    @Test
    void input2() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = approach1.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }
    @Test
    void input3() {
        int[] nums1 = {};
        int[] nums2 = {2,3};
        double result = approach1.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }
    @Test
    void input4() {
        int[] nums1 = {};
        int[] nums2 = {1};
        double result = approach1.findMedianSortedArrays(nums1, nums2);
        assertEquals(1.0, result);
    }

    @Test
    void input5() {
        int[] nums1 = {4};
        int[] nums2 = {1,2,3,5,6,7};
        double result = approach1.findMedianSortedArrays(nums1, nums2);
        assertEquals(1.0, result);
    }
}
