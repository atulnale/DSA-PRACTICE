package problem76;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        boolean result = approach1.check(new int[]{3, 4, 5, 1, 2});
        assertTrue(result);
    }
    @Test
    void basic2() {
        boolean result = approach1.check(new int[]{2,1,3,4});
        assertFalse(result);
    }
    @Test
    void basic3() {
        boolean result = approach1.check(new int[]{1,2,3});
        assertTrue(result);
    }
}