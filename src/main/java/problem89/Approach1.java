package problem89;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> result = new ArrayList<>();
        int ai = 0;
        int bi = 0;
        while(ai<a.length || bi< b.length) {
            int num1 = ai<a.length ?  a[ai]: Integer.MAX_VALUE;
            int num2 = bi<b.length ?  b[bi]: Integer.MAX_VALUE;
            if(num1 == num2) {
                if(result.size() == 0 || result.get(result.size()-1) !=  num2){
                    result.add(num2);
                }
                ai++;
                bi++;
            } else if(num1 < num2) {
                if(result.size() == 0 || result.get(result.size()-1) != num1){
                result.add(num1);

                }
                ai++;
            } else {
                if(result.size() == 0 || result.get(result.size()-1) != num2){

                result.add(num2);
                }
                bi++;
            }
        }
        return result;
    }
}