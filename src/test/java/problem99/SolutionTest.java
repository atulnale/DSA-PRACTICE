package problem99;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5,result);
    }

    @Test
    void basic2() {
        int result = main.maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0,result);
    }
}