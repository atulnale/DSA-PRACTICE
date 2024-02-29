package problem44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        boolean result = approach1.isMatch("aa", "a");
        assertFalse(result);
    }
    @Test
    void basic2() {
        boolean result = approach1.isMatch("aa", "*");
        assertTrue(result);
    }
    @Test
    void basic3() {
        boolean result = approach1.isMatch("aa", "?a");
        assertTrue(result);
    }
    @Test
    void basic4() {
        boolean result = approach1.isMatch("aa", "?b");
        assertFalse(result);
    }
    @Test
    void basic5() {
        boolean result = approach1.isMatch("acdcb", "a*c?b");
        assertFalse(result);
    }
    @Test
    void basic6() {
        boolean result = approach1.isMatch("cb", "*c");
        assertFalse(result);
    }
    @Test
    void basic7() {
        boolean result = approach1.isMatch("", "****");
        assertTrue(result);
    }

    @Test
    void basic8() {
        boolean result = approach1.isMatch("adceb", "*a*b");
        assertTrue(result);
    }
    @Test
    void basic9() {
        boolean result = approach1.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b");
        assertFalse(result);
    }
}