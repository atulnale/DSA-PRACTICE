package problem14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void basic1() {
        String s = approach1.longestCommonPrefix(new String[]{""});
        assertEquals("",s);
    }
    @Test
    void basic2() {
        String s = approach1.longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl",s);
    }
    @Test
    void basic3() {
        String s = approach1.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("",s);
    }
    @Test
    void basic4() {
        String s = approach1.longestCommonPrefix(new String[]{"aaa","aa","aaa"});
        assertEquals("aa",s);
    }
}