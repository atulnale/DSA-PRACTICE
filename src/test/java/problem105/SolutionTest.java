package problem105;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution main = new Solution();

    @Test
    void basic1() {
        int[][] arr = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        main.setZeroes(arr);
        printMatrix(arr);
    }

    @Test
    void basic2() {
        int[][] arr = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        main.setZeroes(arr);
        printMatrix(arr);
    }

    @Test
    void basic3() {
        int[][] arr = new int[][]{{1,2,3,4}, {5,0,7,8}, {0,10,11,12},{13,14,15,0}};
        main.setZeroes(arr);
        printMatrix(arr);
    }

    private void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}