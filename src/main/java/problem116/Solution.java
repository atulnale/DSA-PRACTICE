package problem116;

public class Solution {
    public static int count(int arr[], int n, int x) {
        boolean isFirstOcc = true;
        int left = 0;
        int right = n;
        int start = 0;
        while(left < right) {
            int mid = left + (right - left) /2;
            if(arr[mid] < x){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(right == n) return 0;
        if(arr[right] == x){
            start = right;
        } else {
            return 0;
        }
        left = 0;
        right = n;
        while(left < right) {
            int mid = left + (right - left ) /2;
            if(arr[mid] > x){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        int end = left-1;
        return end - start + 1;
    }
}