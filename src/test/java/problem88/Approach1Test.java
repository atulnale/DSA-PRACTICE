package problem88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int result = Approach1.linearSearch(5, 4, new int[]{6, 7, 8, 4, 1});
        assertEquals(3,result);
    }
}