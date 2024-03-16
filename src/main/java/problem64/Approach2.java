package problem64;

import java.util.HashMap;

public class Approach2 {
    HashMap<String, Integer> map = new HashMap<>();

    public int uniquePaths(int m, int n) {
        return helper(m-1,n-1);
    }

    public int helper(int m, int n) {
        if(map.containsKey(m+":"+n)) return map.get(m+":"+n);
        if(m == 0 || n == 0) {
            map.put(m+":"+n, 1);
            return 1;
        }
        map.put(m+":"+n, helper(m-1,n) + helper(m,n-1));
        return map.get(m+":"+n);
    }
}