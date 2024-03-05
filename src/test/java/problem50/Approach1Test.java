package problem50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        double result = approach1.myPow(2.00000, 10);
        assertEquals(1024.00000, result);
    }

    @Test
    void basic2() {
        double result = approach1.myPow(2.10000, 3);
        assertEquals(9.26100, result);
    }


    @Test
    void basic3() {
        double result = approach1.myPow(2.00000, -2);
        assertEquals(.25, result);
    }
}