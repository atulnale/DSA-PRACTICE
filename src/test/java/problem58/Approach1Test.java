package problem58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.lengthOfLastWord("Hellos World");
        assertEquals(5, result);
    }

    @Test
    void basic2() {
        int result = obj.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, result);
    }
    @Test
    void basic3() {
        int result = obj.lengthOfLastWord("luffy is still joyboy");
        assertEquals(6, result);
    }
}