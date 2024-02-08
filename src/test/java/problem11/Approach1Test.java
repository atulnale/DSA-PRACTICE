package problem11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49,result);
    }
    @Test
    void basic2() {
        int result = obj.maxArea(new int[]{1,1});
        assertEquals(1,result);
    }
    @Test
    void basic3() {
        int result = obj.maxArea(new int[]{1,2,4,3});
        assertEquals(4,result);
    }
}