package problem10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic() {
        boolean result = approach1.isMatch("aa", "a");
        assertFalse(result);
    }
    @Test
    void basic1() {
        boolean result = approach1.isMatch("aa", "a*");
        assertTrue(result);
    }
    @Test
    void basic2() {
        boolean result = approach1.isMatch("aa", "a.");
        assertTrue(result);
    }
    @Test
    void basic3() {
        boolean result = approach1.isMatch("aa", ".a");
        assertTrue(result);
    }
    @Test
    void basic4() {
        boolean result = approach1.isMatch("aa", "a*");
        assertTrue(result);
    }
    @Test
    void basic5() {
        boolean result = approach1.isMatch("aa", ".*");
        assertTrue(result);
    }
    @Test
    void basic6() {
        boolean result = approach1.isMatch("mississippi", "mis*is*p*.");
        assertFalse(result);
    }
}