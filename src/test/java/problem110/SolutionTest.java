package problem110;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int result = main.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(4, result);
    }
    @Test
    void basic2() {
        int result = main.search(new int[]{-1,0,3,5,9,12}, 0);
        assertEquals(1, result);
    }
}