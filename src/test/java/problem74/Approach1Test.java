package problem74;

import org.junit.jupiter.api.Test;

class Approach1Test {
    @Test
    void basic1() {
        int[] arr = Approach1.countFrequency(6, 9, new int[]{1, 3, 1, 9, 2, 7});
        printArray(arr);
    }

    @Test
    void basic2() {
        int[] arr = Approach1.countFrequency(6, 4, new int[]{1, 3, 4, 3, 4, 1});
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for(int ele: arr ) {
            System.out.printf(ele + "\t");
        }
    }
}