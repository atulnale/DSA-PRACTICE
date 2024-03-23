package problem107;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.subarraySum(new int[]{1, 4, 1}, 2);
        assertEquals(0,result);
    }
    @Test
    void basic2() {
        int result = main.subarraySum(new int[]{1, 2,3}, 3);
        assertEquals(2,result);
    }
    @Test
    void basic3() {
        int result = main.subarraySum(new int[]{1}, 0);
        assertEquals(0,result);
    }
    @Test
    void basic4() {
        int result = main.subarraySum(new int[]{-1,-1,1}, 0);
        assertEquals(1,result);
    }
}