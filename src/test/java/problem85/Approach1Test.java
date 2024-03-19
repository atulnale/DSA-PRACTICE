package problem85;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int[] nums = {1, 1, 2};
        int result = approach1.removeDuplicates(nums);
        printArray(nums);
        assertEquals(2,result);

    }
    @Test
    void basic2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = approach1.removeDuplicates(nums);
        printArray(nums);
        assertEquals(5,result);

    }

    private void printArray(int[] nums) {
        for(int ele : nums) {
            System.out.printf(ele + "\t");
        }
    }
}