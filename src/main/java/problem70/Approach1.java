package problem70;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    static List<Long> result = new ArrayList<>();
    public static List<Long> factorialNumbers(long n) {
        result.add(1L);
        helper(n, 2);
        return result;
    }
    public static void helper(long n, long i){
        long curr = result.get(result.size() - 1);
        if(curr  * i > n) return;
        result.add(curr * i);
        helper(n,i + 1);

    }
}