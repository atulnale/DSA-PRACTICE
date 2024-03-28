package problem122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void basic1() {
        Solution main = new Solution();
        int result = main.maxSubarrayLength(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2);
        assertEquals(6,result);
    }

    @Test
    void basic2() {
        Solution main = new Solution();
        int result = main.maxSubarrayLength(new int[]{1,2,1,2,1,2,1,2}, 1);
        assertEquals(2,result);
    }

    @Test
    void basic3() {
        Solution main = new Solution();
        int result = main.maxSubarrayLength(new int[]{5,5,5,5,5,5,5}, 4);
        assertEquals(4,result);
    }

    @Test
    void basic4() {
        Solution main = new Solution();
        int result = main.maxSubarrayLength(new int[]{2,1,2,3}, 1);
        assertEquals(3,result);
    }
}