package problem77;

import org.junit.jupiter.api.Test;

class Approach1Test {

    @Test
    void basic1() {
        int[] arr = {8, 6, 2, 5, 1};
        Approach1.selectionSort(arr);
        printArray(arr);
    }
    @Test
    void basic2() {
        int[] arr = {9,3,6,2,0};
        Approach1.selectionSort(arr);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for(int ele : arr){
            System.out.printf(ele + "  ");
        }
    }
}