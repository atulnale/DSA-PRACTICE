package problem33;

import org.junit.jupiter.api.Test;
import problem33.Approach1;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int result = obj.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        assertEquals(4, result);
    }
    @Test
    void basic2() {
        int result = obj.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1);
        assertEquals(5, result);
    }
    @Test
    void basic3() {
        int result = obj.search(new int[]{7, 0, 1, 2}, 1);
        assertEquals(2, result);
    }

    @Test
    void basic4() {
        int result = obj.search(new int[]{4,5,6,7,0,1,2}, 3);
        assertEquals(-1, result);
    }

    @Test
    void basic5() {
        int result = obj.search(new int[]{1}, 0);
        assertEquals(-1, result);
    }
    @Test
    void basic6() {
        int result = obj.search(new int[]{4,5,6,7,8,1,2,3}, 8);
        assertEquals(4, result);
    }
    @Test
    void basic7() {
        int result = obj.search(new int[]{3,1}, 1);
        assertEquals(1, result);
    }
}