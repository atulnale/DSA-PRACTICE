package problem8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void startsWithChar1() {
        int expected = approach1.myAtoi("cahsdf45");
        assertEquals(0,expected);
    }
    @Test
    void startsWithChar2() {
        int expected = approach1.myAtoi("-cahsdf45");
        assertEquals(0,expected);
    }
    @Test
    void startsWithCharWithLeadingSpaces() {
        int expected = approach1.myAtoi("    -45");
        assertEquals(-45,expected);
    }
    @Test
    void s42() {
        int expected = approach1.myAtoi("42");
        assertEquals(42,expected);
    }
    @Test
    void test1() {
        int expected = approach1.myAtoi("   -42");
        assertEquals(-42,expected);
    }

    @Test
    void test2() {
        int expected = approach1.myAtoi("4193 with words");
        assertEquals(4193,expected);
    }
    @Test
    void overflorString() {
        int expected = approach1.myAtoi("-91283472332");
        assertEquals(-2147483648,expected);
    }
    @Test
    void emptyString() {
        int expected = approach1.myAtoi("");
        assertEquals(0,expected);
    }
    @Test
    void edgeCase() {
        int expected = approach1.myAtoi("2147483648");
        assertEquals(2147483647,expected);
    }
    @Test
    void edgeCase2() {
        int expected = approach1.myAtoi("-2147483647");
        assertEquals(-2147483647,expected);
    }
    @Test
    void edgeCase3() {
        int expected = approach1.myAtoi("-2147483649");
        assertEquals(-2147483648,expected);
    }
    @Test
    void edgeCase4() {
        int expected = approach1.myAtoi("21474836460");
        assertEquals(2147483647,expected);
    }
    @Test
    void edgeCase5() {
        int expected = approach1.myAtoi("-21474836482");
        assertEquals(-2147483648,expected);
    }
}