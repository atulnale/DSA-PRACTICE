package problem29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int divide = approach1.divide(10, 3);
        assertEquals(3,divide);
    }
    @Test
    void basic2() {
        int divide = approach1.divide(7, -3);
        assertEquals(-2,divide);
    }

    @Test
    void basic3() {
        int divide = approach1.divide(1, 2);
        assertEquals(0,divide);
    }
    @Test
    void basic4() {
        int divide = approach1.divide(2147483647, 1);
        assertEquals(2147483647,divide);
    }

    @Test
    void basic5() {
        int divide = approach1.divide(-2147483648, 2);
        assertEquals(-1073741824,divide);
    }
}