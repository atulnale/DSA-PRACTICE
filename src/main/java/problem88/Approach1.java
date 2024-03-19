package problem88;

public class Approach1 {
    public static int linearSearch(int n, int num, int []arr){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) return i;
        }
        return -1;
    }
}