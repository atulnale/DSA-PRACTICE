package problem77;

public class Approach1 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int index = -1;
            int num = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < num){
                    index = j;
                    num = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

}