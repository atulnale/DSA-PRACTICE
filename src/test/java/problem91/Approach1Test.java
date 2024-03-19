package problem91;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int[] nums = {1,1,0,1,1,1};
        int result = approach1.findMaxConsecutiveOnes(nums);
        assertEquals(3,result);
    }
    @Test
    void basic2() {
        int[] nums = {1,0,1,1,0,1};
        int result = approach1.findMaxConsecutiveOnes(nums);
        assertEquals(2,result);
    }
}