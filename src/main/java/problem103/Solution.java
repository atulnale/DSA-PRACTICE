package problem103;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> result = new ArrayList<>();
        int currMax = Integer.MIN_VALUE;
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i] > currMax){
                result.add(a[i]);
                currMax = a[i];
            }
        }
        return result;
    }
}