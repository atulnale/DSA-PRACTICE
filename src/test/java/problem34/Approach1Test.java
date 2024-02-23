package problem34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int[] result = approach1.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void basic2() {
        int[] result = approach1.searchRange(new int[]{5,7,7,8,8,10}, 6);
        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }
    @Test
    void basic3() {
        int[] result = approach1.searchRange(new int[]{}, 0);
        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }
}