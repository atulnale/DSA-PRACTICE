package problem119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.maxProduct(new int[]{2, 3, -2, 4});
        assertEquals(6, result);
    }

    @Test
    void basic2() {
        int result = main.maxProduct(new int[]{-2,0,-1});
        assertEquals(0, result);
    }
}