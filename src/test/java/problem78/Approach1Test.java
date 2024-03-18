package problem78;

import org.junit.jupiter.api.Test;

class Approach1Test {

    @Test
    void basic1() {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        Approach1.bubbleSort(arr, arr.length);
        printArray(arr);
    }
    @Test
    void basic2() {
        int[] arr = {9,3,6,2,0};
        Approach1.bubbleSort(arr, arr.length);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for(int ele: arr){
            System.out.printf(ele + "  ");
        }
    }
}