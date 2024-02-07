package problem7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Approach1Test {
    Approach2 approach1 = new Approach2();


    @Test
    void test1() {
        int result = approach1.reverse(123);
        assertEquals(321, result);
    }
    @Test
    void test2() {
        int result = approach1.reverse(-123);
        assertEquals(-321, result);
    }
    @Test
    void test3() {
        int result = approach1.reverse(-2147483648);
        assertEquals(0, result);
    }
}