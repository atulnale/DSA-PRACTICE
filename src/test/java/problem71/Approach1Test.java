package problem71;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int[] arr = Approach1.reverseArray(6, new int[]{5, 7, 8, 1, 6, 3});
        printArray(arr);

    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}