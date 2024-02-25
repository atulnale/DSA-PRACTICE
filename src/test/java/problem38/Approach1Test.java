package problem38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        String result = approach1.countAndSay(1);
        assertEquals("1", result);
    }
    @Test
    void basic2() {
        String result = approach1.countAndSay(2);
        assertEquals("11", result);
    }
    @Test
    public void basic3() {
        String result = approach1.countAndSay(3);
        assertEquals("21", result);
    }
    @Test
    public void basic4() {
        String result = approach1.countAndSay(4);
        assertEquals("1211", result);
    }
}