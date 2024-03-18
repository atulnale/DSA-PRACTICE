package problem82;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        Approach1.mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    @Test
    void basic2() {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        Approach1.mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for(int ele : arr){
            System.out.printf(ele + " \t");
        }
    }
}