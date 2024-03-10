package problem56;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int[][] merge = obj.merge(new int[][]{{2, 5}, {8, 10}, {1, 6}});
        printInterval(merge);
    }

    @Test
    void basic2() {
        int[][] merge = obj.merge(new int[][]{{1,3}, {2,6},{8,10},{15,18}});
        printInterval(merge);
    }

    private void printInterval(int[][] merge) {
        for (int i = 0; i < merge.length; i++) {
            System.out.printf("{%d,%d}",merge[i][0], merge[i][1]);
        }
    }
}