package problem3;

import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int left = -1;
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i)) && left < map.get(s.charAt(i))){
                left = map.get(s.charAt(i));
            }
            result = Math.max(i - left , result);
            map.put(s.charAt(i), i);
        }
        return  result;
    }
}
