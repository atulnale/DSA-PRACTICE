package problem20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        boolean result = approach1.isValid("()");
        assertTrue(result);
    }
    @Test
    void basic2() {
        boolean result = approach1.isValid("()[]{}");
        assertTrue(result);
    }
    @Test
    void basic3() {
        boolean result = approach1.isValid("(]");
        assertFalse(result);
    }
}