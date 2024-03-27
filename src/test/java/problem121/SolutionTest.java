package problem121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main= new Solution();
    @Test
    void basic1() {
        int result = main.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
        assertEquals(8, result);
    }
    @Test
    void basic2() {
        int result = main.numSubarrayProductLessThanK(new int[]{1,2,3}, 0);
        assertEquals(0, result);
    }
}