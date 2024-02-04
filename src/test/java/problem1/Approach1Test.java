package problem1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Approach1Test {
    static Approach1 approach1 ;
    @BeforeClass
    public static void  setup(){
        approach1 = new Approach1();
    }

    @Test
    public void input1() {
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, approach1.twoSum(nums1, target1));

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, approach1.twoSum(nums2, target2));

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, approach1.twoSum(nums3, target3));

    }
}
