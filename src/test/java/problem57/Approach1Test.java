package problem57;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int[][] insert = approach1.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
    }
}