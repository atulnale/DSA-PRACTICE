package problem52;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int res = approach1.totalNQueens(4);
        assertEquals(2,res);
    }
    @Test
    void basic2() {
        int res = approach1.totalNQueens(1);
        assertEquals(1,res);
    }
}