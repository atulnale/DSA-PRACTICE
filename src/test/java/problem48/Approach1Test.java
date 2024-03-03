package problem48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        approach1.rotate(matrix);
        displayMatrix(matrix);
    }
    @Test
    void basic2() {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        approach1.rotate(matrix);
        displayMatrix(matrix);
    }


    void displayMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(matrix[i][j]+"\t");
            }
        }
    }
}