package problem79;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {

    @Test

    void basic1() {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        Approach1.insertionSort(arr, arr.length);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for(int ele : arr) {
            System.out.printf(ele + "   ");
        }
    }
}