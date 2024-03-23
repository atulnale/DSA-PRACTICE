package problem113;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic4() {
        int result = main.searchInsert(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0,result);
    }
    @Test
    void basic3() {
        int result = main.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4,result);
    }
    @Test
    void basic2() {
        int result = main.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1,result);
    }

    @Test
    void basic1() {
        int result = main.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2,result);
    }
}