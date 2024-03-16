package problem74;

public class Approach1 {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] arr = new int[n];
        for(int ele: nums){
            if(ele > n) continue;
            arr[ele-1]++;
        }
        return arr;
    }
}