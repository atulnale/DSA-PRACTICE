package problem82;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public static void mergeSort(int[] arr, int l, int r){
        if( l < r){
            int mid = l + ( r - l ) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);;
            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        List<Integer> list = new ArrayList<>();
        int i = l;
        int i_end = mid;
        int j = mid + 1;
        int j_end = r;
        while( i <= i_end || j <= j_end){
            int num1 = i<=i_end ? arr[i]: Integer.MAX_VALUE;
            int num2 = j <= j_end ? arr[j] : Integer.MAX_VALUE;
            if(num1 < num2){
                list.add(num1);
                i++;
            } else {
                list.add(num2);
                j++;
            }
        }
        i = l;
        for(int ele: list){
            arr[l] = ele;
            l++;
        }
    }

}