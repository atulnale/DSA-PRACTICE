package problem75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 obj = new Approach1();
    @Test
    void basic1() {
        int resu = obj.maxFrequency(new int[]{1, 2, 4}, 5);
        assertEquals(3, resu);
    }
    @Test
    void basic2() {
        int resu = obj.maxFrequency(new int[]{1, 4,8,13}, 5);
        assertEquals(2, resu);
    }
    @Test
    void basic3() {
        int resu = obj.maxFrequency(new int[]{3,9,6}, 2);
        assertEquals(1, resu);
    }
    @Test
    void basic4() {
        int[] arr = new int[40000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= 1;
        }
        arr[arr.length-1] = 100000;
        int resu = obj.maxFrequency(arr, 1);
        assertEquals(arr.length-1, resu);
    }
}