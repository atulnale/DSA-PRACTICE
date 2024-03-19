package problem92;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int[] nums= {2,2,1};
        int result = approach1.singleNumber(nums);
        assertEquals(1,result);
    }
    @Test
    void basic2() {
        int[] nums= {4,1,2,1,2};
        int result = approach1.singleNumber(nums);
        assertEquals(4,result);
    }
}