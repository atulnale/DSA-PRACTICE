package problem13;


import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    static Map<String,Integer> map = new HashMap<>();
    static {
        for(int i = 0; i< values.length; i++) {
            map.put(symbols[i],values[i]);
        }
    }
    int result = 0;
    public int romanToInt(String s) {
        if(s.length() == 0) return result;
        if(s.length()>=2 && map.containsKey(s.substring(0,2))){
           result += map.get(s.substring(0,2));
           return romanToInt(s.substring(2));
        } else {
            result += map.get(s.substring(0,1));
            return romanToInt(s.substring(1));
        }
    }
}
