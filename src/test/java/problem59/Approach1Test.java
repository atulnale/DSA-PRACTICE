package problem59;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();

    @Test
    void basic1() {
        int[][] mat = obj.generateMatrix(3);
        printMatrix(mat);
    }
    @Test
    void basic2() {
        int[][] mat = obj.generateMatrix(5);
        printMatrix(mat);
    }

    private void printMatrix(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}