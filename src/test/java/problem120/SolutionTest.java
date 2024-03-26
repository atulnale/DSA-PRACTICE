package problem120;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();
    @Test
    void basic1() {
        int result = main.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        assertEquals(4, result);
    }

    @Test
    void basic2() {
        int result = main.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        assertEquals(-1, result);
    }
    @Test
    void basic3() {
        int result = main.search(new int[]{4,5,6,7,8,1,2,3}, 8);
        assertEquals(4, result);
    }

    @Test
    void basic4() {
        int result = main.search(new int[]{3,1}, 1);
        assertEquals(1, result);
    }
}