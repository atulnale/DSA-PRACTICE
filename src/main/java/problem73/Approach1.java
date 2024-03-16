package problem73;

import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if(map.containsKey(n)) return map.get(n);
        if(n == 0 || n == 1) {
            map.put(n, n);
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }
}