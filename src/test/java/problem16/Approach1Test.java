package problem16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();
    @Test
    void basic1() {
        int result = obj.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2,result);
    }

    @Test
    void basic2() {
        int result = obj.threeSumClosest(new int[]{0,0,0}, 1);
        assertEquals(0,result);
    }

    @Test
    void basic3() {
        int result = obj.threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2);
        assertEquals(-2,result);
    }
}