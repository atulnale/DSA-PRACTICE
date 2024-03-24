package problem115;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void basic1() {
        int[] re = Solution.getFloorAndCeil(new int[]{3, 4, 7, 8, 10}, 6, 5);
        printArray(re);
    }

    @Test
    void basic2() {
        int[] re = Solution.getFloorAndCeil(new int[]{3, 4,4,7,8,10}, 6, 8);
        printArray(re);
    }

    @Test
    void basic3() {
        int[] re = Solution.getFloorAndCeil(new int[]{3, 4,4,7,8,10}, 6, 2);
        printArray(re);
    }

    @Test
    void basic4() {
        int[] re = Solution.getFloorAndCeil(new int[]{2}, 1, 23);
        printArray(re);
    }

    private void printArray(int[] re) {
        for (int result : re) {

            System.out.printf(result + "\t");
        }
    }
}