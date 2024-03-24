package problem115;

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {

        int floor =0;
        int ceil = 0;
        int left = 0;
        int right = n;
        while(left < right) {
            int mid = left + (right - left )/2;
            if(a[mid] == x) {
                left = mid;
                break;
            }
            if(a[mid]< x){
                left = mid +1  ;
            } else {
                right = mid;
            }
        }
        if (left == n){
            ceil = -1;
        } else {
            ceil =a[left];
        }

        left = 0;
        right = n;
        while(left < right) {
            int mid = left + (right - left ) /2;
            if(a[mid] == x){
                left = mid+1;
                break;
            }
            if(a[mid] > x){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if(left == 0){
            floor = -1;
        } else {
            floor = a[left-1];
        }

        return new int[]{floor, ceil};
    }
}