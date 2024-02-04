package problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void abcabcbb() {
        int result = approach1.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }
    @Test
    void bbbbb() {
        int result = approach1.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    void pwwkew() {
        int result = approach1.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    void aab() {
        int result = approach1.lengthOfLongestSubstring("aab");
        assertEquals(2, result);
    }
}
