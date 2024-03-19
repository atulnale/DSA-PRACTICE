package problem84;

import org.junit.jupiter.api.Test;

class Approach1Test {
    @Test
    void basic1() {

        int[] arr = Approach1.getSecondOrderElements(5, new int[]{1, 2, 3, 4, 5});
        printArray(arr);

    }

    @Test
    void basic2() {

        int[] arr = Approach1.getSecondOrderElements(5, new int[]{3,4,5,2});
        printArray(arr);

    }

    private void printArray(int[] arr) {
        for(int ele : arr) {
            System.out.printf(ele + " \t");
        }
    }


}