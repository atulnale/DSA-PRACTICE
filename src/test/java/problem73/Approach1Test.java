package problem73;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        int result = approach1.fib(2);
        assertEquals(1,result);
    }
    @Test
    void basic2() {
        int result = approach1.fib(4);
        assertEquals(3,result);
    }
}