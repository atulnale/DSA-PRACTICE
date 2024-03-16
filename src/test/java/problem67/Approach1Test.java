package problem67;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int[] arr = Approach1.printNos(5);
        printArray(arr);
    }

    @Test
    void basic2() {
        int[] arr = Approach1.printNos(2);
        printArray(arr);
    }
    private void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}