package problem112;

public class Solution {
    public static int upperBound(int []arr, int x, int n) {
        int low=0,high=n;

        while(low<high){

            int mid=low+(high-low)/2;
            if(arr[mid] > x){
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        return high;
    }
}