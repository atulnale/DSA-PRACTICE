package problem87;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();

    @Test
    void basic1() {
        int[] arr = {0,1,0,3,12};
        approach1.moveZeroes(arr);
        printArrary(arr);
    }
    @Test
    void basic2() {
        int[] arr = {0,1,1,3,12};
        approach1.moveZeroes(arr);
        printArrary(arr);
    }

    private void printArrary(int[] arr) {
        for(int ele: arr ){
            System.out.printf(ele + "\t");
        }
    }
}