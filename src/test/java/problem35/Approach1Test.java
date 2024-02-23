package problem35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int result = approach1.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, result);
    }
    @Test
    void basic2() {
        int result = approach1.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, result);
    }
    @Test
    void basic3() {
        int result = approach1.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, result);
    }
}